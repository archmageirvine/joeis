package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084691 10000 times the n-th zero of the BesselJ function of zero order, rounded.
 * @author Sean A. Irvine
 */
public class A084691 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      try {
        final CR v = new UnaryCrFunction() {
          @Override
          public CR execute(final CR x) {
            return CrFunctions.BESSEL_J0.cr(x);
          }
        }.inverseMonotone(CR.valueOf(mN), CR.valueOf(mN + 1)).execute(CR.ZERO);
        return v.multiply(10000).round();
      } catch (final ArithmeticException e) {
        // too bad, no root in this range
      }
    }
  }
}
