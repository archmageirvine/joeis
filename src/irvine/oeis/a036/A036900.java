package irvine.oeis.a036;

import irvine.math.cr.CR;
import irvine.oeis.a032.A032510;

/**
 * A036900 Scan decimal expansion of e until all n-digit strings have been seen; a(n) is last string seen.
 * @author Sean A. Irvine
 */
public class A036900 extends A032510 {

  @Override
  protected CR getCR() {
    return CR.E.divide(CR.TEN); // So we can ignore the period
  }
}
