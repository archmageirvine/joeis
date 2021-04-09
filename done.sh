#!/bin/bash
#
# Plot a graph of the proportion of sequences done in each bucket of 1000.
# Also produce a heat map with one pixel per sequence showing those implemented.

max=350

for bucket in $(seq 0 ${max}); do
    b="00${bucket}"
    b=${b: -3}
    if [[ -d src/irvine/oeis/a${b} ]]; then
        impl=$(find "src/irvine/oeis/a${b}" -name "A${b}[0-9][0-9][0-9].java" | wc -l)
    else
        impl=0
    fi
    echo "${b} ${impl}"
done >oeis_done.dat

gnuplot <<EOF
   set term pngcairo size 900,500
   set output "oeis-done.png"
   set xlabel "Sequence Bin"
   set ylabel "Implemented"
   set yrange [0:1000]
   set tics out
   set title "Implemented OEIS Sequences (bins of 1000 sequences)"
   plot "oeis_done.dat" using 1:2 with impulses title "Total Implemented"
EOF

# A heat map view showing green for implemented
{
    for bucket in $(seq 0 ${max}); do
        b="00${bucket}"
        b=${b: -3}
        if [[ -d src/irvine/oeis/a${b} ]]; then
            find "src/irvine/oeis/a${b}" -name "A${b}[0-9][0-9][0-9].java" | sed 's/.*A0*//;s/\.java//' | while read impl; do
                echo "${impl}"
                echo "$((impl/1000)) $((impl%1000)) g"
            done
        fi
    done
} | awk -vmax=${max} '{pix[$1,$2]=$3}END{print "P6 1000 "max" 1"; for (y=0;y<max;y++) for(x=0; x<1000;x++) {val=pix[y,x]; if (val=="g") {printf "%c%c%c", 0, 1, 0} else {printf "%c%c%c", 0, 0, 0 }}}' | pnmtopng >oeis-implemented.png

# The oeis-by-month.dat file was computed in the following way from the oeis_created.txt
# file constructed by Georg Fischer.  Afterward I manually trimmed the file to post-2009.
#  sort -k2 oeis_created.txt | grep '^A' | grep -v 1971-12-31 | tr -d '\r' | sed 's/-[0-9][0-9]$//' | awk '{if ($2!=prev){print $2"-01",NR-1}; prev=$2}' >oeis-by-month.dat

gnuplot <<EOF
        set term pngcairo
        set output "oeis-history.png"
        set xlabel "Year (20xx)"
        set ylabel "Sequences"
        set title "History"
        set xdata time     
        #set xtics 63072000
        set timefmt "%Y-%m-%d"
        set format x "%y"
        set key left
        plot "oeis-by-month.dat" using 1:2 with lines title "OEIS sequences", "history.dat" using 1:2 with lines title "jOEIS implementations"
EOF

mv ./*.png doc
