package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034758 Dirichlet convolution of primes (with 1) with Bell numbers.
 * @author Sean A. Irvine
 */
public class A034758 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Functions.PRIME.z(mN / d - 1).multiply(Functions.BELL.z(d - 1)));
    }
    return sum;
  }
}
