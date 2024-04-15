package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Puma;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034773 Dirichlet convolution of d(n) (number of divisors of n) with primes (with 1).
 * @author Sean A. Irvine
 */
public class A034773 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Functions.SIGMA0.z(mN / d).multiply(Puma.prime(d - 1)));
    }
    return sum;
  }
}
