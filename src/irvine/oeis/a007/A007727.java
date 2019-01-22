package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.Mobius;
import irvine.oeis.Sequence;

/**
 * A007727.
 * @author Sean A. Irvine
 */
public class A007727 implements Sequence {

  protected long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final long d = dd.longValueExact();
      sum = sum.add(Binomial.binomial(2 * d , d).multiply(Mobius.mobius(mN / d)));
    }
    return sum;
  }
}
