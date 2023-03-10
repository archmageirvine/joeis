package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A061848.
 * @author Sean A. Irvine
 */
public class A061848 extends A065091 {

  @Override
  public Z next() {
    final int p = super.next().intValueExact();
    Z sum = Z.ZERO;
    final int s = (p - 1) / 2;
    for (final Z rr : Jaguar.factor(s).divisors()) {
      if (rr.isEven()) {
        final int r = rr.intValue();
        sum = sum.add(Z.valueOf(LongUtils.phi(r)).shiftLeft(2 * s / r));
      }
    }
    return sum.divide(s);
  }
}
