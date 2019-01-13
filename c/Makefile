all: nosean a029497 a048345 a061933 a061937 a080515 a080807 a080808 a080808b a080809 a080810 a080811 a080812 a108825 a127315 a248037

install: nosean
	chmod a+rs nosean
	cp nosean /home/sean
	chmod a+rs /home/sean/nosean
	chmod o-w /home/sean/nosean

nosean: nosean.c
	gcc -Wall -O3 -o nosean nosean.c

a%: a%.c
	gcc -Wall -O3 -o $@ $< -lgmp

clean:
	/bin/rm -rf *~ nosean a029497 a048345 a061933 a061937 a080515 a080807 a080808 a080808b a080809 a080810 a080811 a080812 a080515 a080516 a108825 a127315 a248037

