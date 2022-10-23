package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055894 Inverse Moebius transform of Pascal's triangle A007318.
 * @author Sean A. Irvine
 */
public class A055894 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      if (++mN == 0) {
        return Z.ONE;
      }
      mM = 0;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(LongUtils.gcd(mN, mM)).divisors()) {
      final long d = dd.longValue();
      sum = sum.add(Binomial.binomial(mN / d, mM / d));
    }
    return sum;
  }
}
