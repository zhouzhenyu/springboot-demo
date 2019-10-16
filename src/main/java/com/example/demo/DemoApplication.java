package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(String name){
        return "Hello " + name;
    }

    @RequestMapping("/helloworld")
    public String helloWorldView(String name,Model model){
        model.addAttribute("name",name);
        return "helloworld";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
