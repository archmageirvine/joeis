package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A038783 An intermediate sequence for nonisomorphic circulant undirected p^2-graphs, indexed by odd primes p.
 * @author Sean A. Irvine
 */
public class A038783 extends A065091 {

  @Override
  public Z next() {
    final int p = super.next().intValueExact();
    Z sum = Z.ZERO;
    for (final Z rr : Jaguar.factor(p - 1).divisors()) {
      final int r = rr.intValue();
      final int q = (p - 1) / r;
      if ((q & 1) == 0) {
        sum = sum.add(Functions.PHI.z(r).shiftLeft(q));
      }
    }
    return sum.multiply2().divide(p - 1);
  }
}
