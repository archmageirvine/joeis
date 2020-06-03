#!/bin/bash
#
# Generate a test class for an OEIS sequence.

function create-all-tests() {
    local dir="${1}"

    echo "Creating AllTests.java for ${dir}"

    mkdir -p test/irvine/oeis/${dir}
    cat >"test/irvine/oeis/${dir}/AllTests.java" <<EOF
package irvine.oeis.${dir};

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test class for all tests in this directory.
 * @author Sean A. Irvine
 */
public class AllTests extends TestSuite {

  public static Test suite() {
    final TestSuite suite = new TestSuite();
    return suite;
  }

  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
EOF
    git add "test/irvine/oeis/${dir}/AllTests.java"

    # Add into parent AllTests
    grep 'addTest(' <test/irvine/oeis/AllTests.java >suites.tmp
    echo "    suite.addTest(irvine.oeis.${dir}.AllTests.suite());" >>suites.tmp
    sort <suites.tmp | uniq >suites.srt
    grep -v 'addTest(' <test/irvine/oeis/AllTests.java >suites.tmp
    csplit -s -f suites suites.tmp '/return suite/'
    cat suites00 suites.srt suites01 >test/irvine/oeis/AllTests.java
}

seq=$1
max_terms=$2

if [ "${seq}" == "" ] || [ ${#seq} != 7 ]; then
    echo "Usage: $0 Annnnnn [max-terms]"
    exit
fi

dir=$(echo "${seq%[0-9][0-9][0-9]}" | tr 'A' 'a')
alltests="test/irvine/oeis/${dir}/AllTests.java"

[[ -r ${alltests} ]] || create-all-tests "${dir}"

# sed "s/A000031/$seq/g;s/a000/$dir/" <test/irvine/oeis/a000/A000031Test.java >"test/irvine/oeis/${dir}/${seq}Test.java"
# if [ "${max_terms}" != "" ]; then
#    grep -v "^${seq}" <test/irvine/oeis/test-terms.dat >test/irvine/oeis/test-terms.dat.t && mv test/irvine/oeis/test-terms.dat.t test/irvine/oeis/test-terms.dat
#    echo "${seq} ${max_terms}" >>test/irvine/oeis/test-terms.dat
# fi
# git add "test/irvine/oeis/${dir}/${seq}Test.java"

grep addTestSuite <"${alltests}" >suites.tmp
echo "    suite.addTestSuite(${seq}Test.class);" >>suites.tmp
sort <suites.tmp | uniq >suites.srt
grep -v addTestSuite <"${alltests}" >suites.tmp
csplit -s -f suites suites.tmp '/return suite/'
cat suites00 suites.srt suites01 >"${alltests}"
/bin/rm suites*
