# Make everything to do with factoring; assumes codebase already compiled.
#
# Sean A. Irvine
#
# To remake all the data files, use "make dataclean; make data"
#

JAVAC:=javac -J-Xmx1000m -Xlint -Xlint:-serial

.PHONY: datadir
.PHONY: smarandache

datadir: data smarandache

data:
	mkdir -p data

smarandache: data data/smarandache.gz data/reversesmarandache.gz

data/smarandache.gz: script/Smarandache.java project/smarandache/smarandache.txt
	java irvine.factor.script.Smarandache <project/smarandache/smarandache.txt | gzip -9 >data/smarandache.gz

data/reversesmarandache.gz: script/ReverseSmarandache.java project/smarandache/reversesmarandache.txt
	java irvine.factor.script.ReverseSmarandache <project/smarandache/reversesmarandache.txt | gzip -9 >data/reversesmarandache.gz

clean:
	/bin/rm -f data/smarandache.gz data/reversesmarandache.gz list/cunningham.txt



