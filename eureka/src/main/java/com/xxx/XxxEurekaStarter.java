package com.xxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class XxxEurekaStarter {
    public static void main(String[] args) {
        SpringApplication.run(XxxEurekaStarter.class, args);
    }
}