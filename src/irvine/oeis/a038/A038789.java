package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A038789 Number of nonisomorphic circulant p^2-tournaments, indexed by odd primes p.
 * @author Sean A. Irvine
 */
public class A038789 extends A065091 {

  @Override
  public Z next() {
    final int p = super.next().intValueExact();
    Z sum1 = Z.ZERO;
    Z sum2 = Z.ZERO;
    for (final Z rr : Jaguar.factor(p - 1).divisors()) {
      if (rr.isOdd()) {
        final int r = rr.intValue();
        final int q = (p - 1) / r;
        final Z phi = Z.valueOf(Functions.PHI.l((long) r));
        sum1 = sum1.add(phi.multiply(Z.ONE.shiftLeft((long) (p + 1) * q / 2).subtract(Z.ONE.shiftLeft(q))));
        sum2 = sum2.add(phi.shiftLeft(q / 2));
      }
    }
    sum1 = sum1.divide(p).divide(p - 1);
    sum2 = sum2.divide(p - 1).square();
    return sum1.add(sum2);
  }
}
