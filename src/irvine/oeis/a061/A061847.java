package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A061847.
 * @author Sean A. Irvine
 */
public class A061847 extends A065091 {

  @Override
  public Z next() {
    final int p = super.next().intValueExact();
    Z sum1 = Z.ZERO;
    Z sum2 = Z.ZERO;
    final int s = (p - 1) / 2;
    for (final Z rr : Jaguar.factor(s).divisors()) {
      if (rr.isEven()) {
        final int r = rr.intValue();
        final int q = s / r;
        final Z phi = Z.valueOf(LongUtils.phi(r));
        sum1 = sum1.add(phi.shiftLeft((p + 1) * q));
        sum2 = sum2.add(phi.shiftLeft(2 * q));
      }
    }
    sum1 = sum1.divide(p - 1);
    return sum1.add(sum2).multiply2().divide(p);
  }
}
