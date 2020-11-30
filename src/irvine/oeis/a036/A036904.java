package irvine.oeis.a036;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * A036904 Scan decimal expansion of e until all n-digit strings have been seen; a(n) is number of digits that must be scanned.
 * @author Sean A. Irvine
 */
public class A036904 extends A036903 {

  @Override
  protected CR getCR() {
    return CR.E.divide(CR.TEN); // So we can ignore the period
  }

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
