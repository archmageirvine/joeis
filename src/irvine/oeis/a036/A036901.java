package irvine.oeis.a036;

import irvine.math.cr.CR;
import irvine.oeis.a032.A032510;

/**
 * A036901 Scan decimal expansion of log(2) until all n-digit strings have been seen; a(n) is last string seen.
 * @author Sean A. Irvine
 */
public class A036901 extends A032510 {

  @Override
  protected CR getCR() {
    return CR.TWO.log();
  }
}
