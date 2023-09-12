package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034762 Dirichlet convolution of primes (with 1) with sigma(n).
 * @author Sean A. Irvine
 */
public class A034762 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Puma.primeZ(mN / d - 1).multiply(Jaguar.factor(d).sigma()));
    }
    return sum;
  }
}
