package irvine.oeis.a036;

import irvine.math.cr.CR;

/**
 * A036905 Scan decimal expansion of log(2) until all n-digit strings have been seen; a(n) is number of digits that must be scanned.
 * @author Sean A. Irvine
 */
public class A036905 extends A036904 {

  @Override
  protected CR getCR() {
    return CR.TWO.log();
  }
}
