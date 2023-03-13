package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A061849 Non-Cayley-isomorphic circulant self-complementary undirected p^2-graphs, indexed by odd primes p.
 * @author Sean A. Irvine
 */
public class A061849 extends A065091 {

  @Override
  public Z next() {
    final int p = super.next().intValueExact();
    final int s = (p - 1) / 2;
    Z sum = Z.ZERO;
    for (final Z rr : Jaguar.factor(s).divisors()) {
      if (rr.isEven()) {
        final int r = rr.intValue();
        sum = sum.add(Z.valueOf(LongUtils.phi(r)).shiftLeft(s / r));
      }
    }
    return sum.divide(s).square();
  }
}
