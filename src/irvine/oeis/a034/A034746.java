package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Puma;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034746 Dirichlet convolution of Fibonacci numbers with Primes (with 1).
 * @author Sean A. Irvine
 */
public class A034746 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Puma.primeZ(mN / d - 1).multiply(Functions.FIBONACCI.z((long) d)));
    }
    return sum;
  }
}
