package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A038778 Circulant directed p^2-graphs up to rotations only, indexed by odd primes p.
 * @author Sean A. Irvine
 */
public class A038778 extends A065091 {

  @Override
  public Z next() {
    final int p = super.next().intValueExact();
    Z sum1 = Z.ZERO;
    Z sum2 = Z.ZERO;
    for (final Z rr : Jaguar.factor(p - 1).divisors()) {
      final int r = rr.intValue();
      final int q = (p - 1) / r;
      final Z phi = Z.valueOf(Functions.PHI.l((long) r));
      sum1 = sum1.add(phi.multiply(Z.ONE.shiftLeft((long) (p + 1) * q)));
      sum2 = sum2.add(phi.shiftLeft(2L * q));
    }
    sum1 = sum1.divide(p - 1);
    return sum1.add(sum2).divide(p);
  }
}
