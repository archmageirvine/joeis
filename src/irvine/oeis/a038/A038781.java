package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A038781 Number of nonisomorphic circulant undirected p^2-graphs, indexed by odd primes p.
 * @author Sean A. Irvine
 */
public class A038781 extends A065091 {

  @Override
  public Z next() {
    final int p = super.next().intValueExact();
    Z sum1 = Z.ZERO;
    Z sum2 = Z.ZERO;
    for (final Z rr : Jaguar.factor(p - 1).divisors()) {
      final int r = rr.intValue();
      final int q = (p - 1) / r;
      if ((q & 1) == 0) {
        final Z phi = Z.valueOf(Euler.phiAsLong(r));
        sum1 = sum1.add(phi.multiply(Z.ONE.shiftLeft((p + 1) * q / 2).subtract(Z.ONE.shiftLeft(q))));
        sum2 = sum2.add(phi.shiftLeft(q / 2));
      }
    }
    sum1 = sum1.multiply2().divide(p).divide(p - 1);
    sum2 = sum2.multiply2().divide(p - 1).square();
    return sum1.add(sum2);
  }
}
