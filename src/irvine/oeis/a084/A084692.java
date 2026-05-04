package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084692 Sum of first n zeros of BesselJ function of zero order.
 * @author Sean A. Irvine
 */
public class A084692 extends Sequence1 {

  private CR mSum = CR.ZERO;
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
        if (v.signum() > 0) {
          mSum = mSum.add(v);
        }
        return mSum.multiply(10000).round();
      } catch (final ArithmeticException e) {
        // too bad, no root in this range
      }
    }
  }
}
