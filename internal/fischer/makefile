#!make

# Makefile for joeis 
# 2019-03-28, Georg Fischer
#
GITS=../../..
COMMON=$(GITS)/OEIS-mat/common
LINREC=$(GITS)/OEIS-mat/linrec
DBAT=java -jar $(GITS)/dbat/dist/dbat.jar -e UTF-8 -c worddb
MANY=44444

all: in_joeis mmacall
#--------------------------
batch_mma:
	cut -b1-7 errors-2019-04-02.txt > x.tmp
	grep -f x.tmp $(COMMON)/stripped > subset.tmp
	wc -l subset.tmp
batch_cfsqrt: cfsqrt_gen
	cut -b1-7 cfsqrt_gen.log > x.tmp
	grep -f x.tmp $(COMMON)/stripped > subset.tmp
	wc -l subset.tmp
test:
	java -cp $(GITS)/joeis/build.tmp/joeis.jar irvine.oeis.BatchTest C:\Users\User\work\gits\joeis\internal\fischer\subset.tmp
#--------------------------
in_joeis: # Table tells all implemented jOEIS sequences
	find $(GITS)/joeis/src/irvine/oeis -iname "A*.java" -printf "%f\n" | cut -b1-7 > $@.tmp
	wc -l $@.tmp
	make joeis INFO=$@.tmp
#--------------------------
mmacall:
	make seq2 INFO=$(LINREC)/lrlink_mma2.tmp
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
#--------------------------
zip: # ZIP file with all newly generated Java sequences
	zip -r gen_pattern.`date +%Y-%m-%d`.zip *.pl sqrt1000.tmp makefile *.jav oeis
#---------------------------
mmacheck:
	sed -e "s/ /\t/g" mmacall.tmp | cut -f1,3 > $@.tmp
#----------------
indx_nojoeis: 
	$(DBAT) "SELECT COUNT(seqno) \
	    FROM  lrindx i \
	    WHERE 'A' || seqno NOT IN (SELECT aseqno FROM joeis) \
	"
#---------------------------
cofr_joeis:
	$(DBAT) "SELECT COUNT(aseqno) \
	    FROM  asinfo i \
	    WHERE aseqno     IN (SELECT aseqno FROM joeis) \
	      AND i.keyword LIKE '%cofr%' \
	"
	$(DBAT) "SELECT COUNT(aseqno) \
	    FROM  asinfo i \
	    WHERE aseqno NOT IN (SELECT aseqno FROM joeis) \
	      AND i.keyword LIKE '%cofr%' \
	"
#---------------------------
cfsqrt: cfsqrt_prep cfsqrt_gen
cfsqrt_prep: cfsqrt1 cfsqrt2 cfsqrt3 cfsqrt4 # Generate sequences for continued fraction of sqrt(n)
cfsqrt1:
	java -cp ../../../ramath/dist/ramath.jar org.teherba.ramath.ContinuedFraction \
		-sqrt2 1 1000 > $@.tmp
cfsqrt2:
	sed -e "s/1\///g" -e "s/\; /\;/" cfsqrt1.tmp \
	| grep -e "\;" \
	| sort -k1 | tee $@.tmp
cfsqrt3:
	grep -E "Continued fraction for sqrt\([0-9][0-9]*\)" $(COMMON)/names \
	| grep -vE "sqrt\(2\)" \
	| sed -e "s/ Continued fraction for sqrt(\([0-9][0-9]*\)).*/\t\1\t\1/" \
	| sort -k2 | tee $@.tmp 
cfsqrt4:
	join -1 1 -2 2 -t"	" -o 2.1,2.2,1.2 cfsqrt2.tmp cfsqrt3.tmp > $@.tmp
	grep -vf in_joeis.tmp $@.tmp \
	| sed -e "s/\;/\t/" \
	| tee cfsqrt5.tmp
	wc -l cfsqrt5.tmp
cfsqrt_gen:
	head -n$(MANY) cfsqrt5.tmp \
	| perl gen_pattern.pl -n $(COMMON)/names -p cfsqrtPattern.jav \
	| tee $@.log 
#---------------------------
cofr_sqrt:
	grep -E "Continued fraction for sqrt\([0-9]" $(COMMON)/names \
	> $@.tmp
	make seq INFO=$@.tmp
	$(DBAT) "SELECT aseqno \
	    FROM  seq \
	    WHERE aseqno NOT IN (SELECT aseqno FROM joeis) \
	" \
	| tee $@.tmp
	wc -l $@.tmp
#----------------
joeis: # parameter: $(INFO)
	$(DBAT) -f joeis.create.sql
	cut -b1-7 $(INFO) | grep -E "^A" | $(DBAT) -m csv -r joeis
	$(DBAT) -n joeis
seq: # parameter: $(INFO)
	$(DBAT) -f $(COMMON)/seq.create.sql
	cut -b1-7 $(INFO) | grep -E "^A" | $(DBAT) -m csv -r seq
	$(DBAT) -n seq
seq2: # parameter: $(INFO)
	$(DBAT) -f $(COMMON)/seq2.create.sql
	cat $(INFO) | grep -E "^A" | sort | uniq > seq2.tmp
	$(DBAT) -m csv -r seq2 < seq2.tmp
	$(DBAT) -4 seq2
	$(DBAT) -n seq2
delseq: seq # parameters: $(TAB) $(INFO)
	$(DBAT) -v "DELETE FROM $(TAB) WHERE aseqno IN (SELECT aseqno FROM seq)"
