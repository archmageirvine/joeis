#!make

# Makefile for joeis 
# 2019-03-28, Georg Fischer
#
GITS=../../..
COMMON=$(GITS)/OEIS-mat/common
LINREC=$(GITS)/OEIS-mat/linrec
DBAT=java -jar $(GITS)/dbat/dist/dbat.jar -e UTF-8 -c worddb

all: anumbers mmacall
	
anumbers:
	find ($GITS)/joeis/src/irvine/oeis -iname "A*.java" -printf "%f\n" | cut -b1-7 > $@.tmp
	wc -l $@.tmp
	make seq  -f $(COMMON)/makefile INFO=$@.tmp
mmacall:
	make seq2 -f $(COMMON)/makefile INFO=$(LINREC)/lrlink_mma2.tmp
	$(DBAT) -x "SELECT aseqno, info \
		FROM seq2 \
		WHERE aseqno NOT IN (SELECT aseqno FROM seq) \
		ORDER BY 1 " \
	>        $@.tmp
	head -n4 $@.tmp
	wc -l    $@.tmp
gen_linrec:
	rm -rf oeis
	mkdir  oeis ||:
	perl gen_linrec.pl mmacall.tmp 
zip:
	zip -r gen_linrec.`date +%Y-%m-%d`.zip gen_linrec.pl makefile mmacall.tmp oeis
#---------------------------