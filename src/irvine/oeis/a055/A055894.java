package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055894 Inverse Moebius transform of Pascal's triangle A007318.
 * @author Sean A. Irvine
 */
public class A055894 implements Sequence {

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
    for (final Z dd : Cheetah.factor(LongUtils.gcd(mN, mM)).divisors()) {
      final long d = dd.longValue();
      sum = sum.add(Binomial.binomial(mN / d, mM / d));
    }
    return sum;
  }
}
