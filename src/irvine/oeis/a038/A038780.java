package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A038780 An intermediate sequence for counting nonisomorphic circulant directed p^2-graphs, indexed by odd primes p.
 * @author Sean A. Irvine
 */
public class A038780 extends A065091 {

  @Override
  public Z next() {
    final int p = super.next().intValueExact();
    Z sum = Z.ZERO;
    for (final Z rr : Jaguar.factor(p - 1).divisors()) {
      final int r = rr.intValue();
      sum = sum.add(Z.valueOf(Functions.PHI.l((long) r)).shiftLeft((p - 1) / r));
    }
    return sum.divide(p - 1).square();
  }
}
