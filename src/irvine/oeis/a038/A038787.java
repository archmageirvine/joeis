package irvine.oeis.a038;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A038787 An intermediate sequence for nonisomorphic circulant self-complementary directed p^2-graphs, indexed by odd primes p.
 * @author Sean A. Irvine
 */
public class A038787 extends A065091 {

  @Override
  public Z next() {
    final int p = super.next().intValueExact();
    Z sum = Z.ZERO;
    for (final Z rr : Cheetah.factor(p - 1).divisors()) {
      if (rr.isEven()) {
        final int r = rr.intValue();
        sum = sum.add(Z.valueOf(LongUtils.phi(r)).shiftLeft(2 * (p - 1) / r));
      }
    }
    return sum.divide(p - 1);
  }
}
