#!/bin/bash
#
# Running peeping dave.

tableheader=$1
tablerow=$2
problemfile=$3
modulesummary=$4

addhistorycolumnheader "$tableheader" "Peeping Dave"

# Check variables have been set prior to running this script
if checkcolumnscriptvars "$problemfile" "$tablerow" 1 "JAVA_HOME WEB TMP CODEHOME MAIN_MODULE"; then

# Prerequisites OK, now run
changedate=$(date +"%Y-%m-%d-%H:%M")
prefix=peepingdave
out=changelists/${prefix}.${changedate}.txt
resultsfile=${WEB}/${out}

echo "Starting peepingdave.sh run at $(date)" >"${resultsfile}"
echo >>"${resultsfile}"

"${JAVA_HOME}/bin/java" "-javaagent:${CODEHOME}/lib/handlechecker.jar" AllTests  >>"${resultsfile}" 2>&1

fails=$(grep -c -E '> Trace|> Bad call' <"${resultsfile}")

if ! grep -q -E 'OK|FAILURES' <"${resultsfile}"; then
    msg=ERRORS
    color=red
    addhistorycolumncell "$tablerow" "${BG_ERROR}" "<a href='${out}'>$msg</a>"
elif [ "${fails}" -gt 0 ]; then
    msg="$fails warnings"
    color=orange
    addhistorycolumncell "$tablerow" "${BG_WARN}" "<a href='${out}'>$msg</a>"
else
    msg=OK
    color=green
    addhistorycolumncell "$tablerow" "${BG_OK}" "<a href='${out}'>$msg<a>"
fi

startmodulesummarysection "$modulesummary" "Peeping Dave"
cat <<EOF >>"$modulesummary"
<li><a href="${out}"><font color=${color}>${msg}</font></a>
EOF
endmodulesummarysection "$modulesummary"

fi
