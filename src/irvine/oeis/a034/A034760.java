package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034760 Dirichlet convolution of primes (with 1) with phi(n).
 * @author Sean A. Irvine
 */
public class A034760 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Functions.PRIME.z(mN / d - 1).multiply(Functions.PHI.z(d)));
    }
    return sum;
  }
}
