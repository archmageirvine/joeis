package irvine.oeis.a036;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;

/**
 * A036906 Scan decimal expansion of zeta(3) until all n-digit strings have been seen; a(n) is number of digits that must be scanned.
 * @author Sean A. Irvine
 */
public class A036906 extends A036903 {

  @Override
  protected CR getCR() {
    return Zeta.zeta(3);
  }

  @Override
  public Z next() {
    return super.next().add(2);
  }
}
