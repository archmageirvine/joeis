package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A038788 Non-Cayley-isomorphic circulant self-complementary directed p^2-graphs, indexed by odd primes p.
 * @author Sean A. Irvine
 */
public class A038788 extends A065091 {

  @Override
  public Z next() {
    final int p = super.next().intValueExact();
    Z sum = Z.ZERO;
    for (final Z rr : Jaguar.factor(p - 1).divisors()) {
      if (rr.isEven()) {
        final int r = rr.intValue();
        sum = sum.add(Z.valueOf(Euler.phiAsLong(r)).shiftLeft((p - 1) / r));
      }
    }
    return sum.divide(p - 1).square();
  }
}
