package irvine.oeis.a051;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a060.A060006;

/**
 * A051017 Numbers k for which r^k-floor(r^k) &gt; 1/2, where r is the real root of x^3-x-1.
 * @author Sean A. Irvine
 */
public class A051017 extends A060006 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final CR rn = getCR().pow(++mN);
      if (rn.frac().compareTo(CR.HALF) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
