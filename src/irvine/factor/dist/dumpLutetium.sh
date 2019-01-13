#!/usr/bin/expect
set command [lindex ${argv} 0]
spawn telnet claude 11711
sleep 2
send "$command\r"
expect


