package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034747 Dirichlet convolution of Fibonacci numbers with sigma(n).
 * @author Sean A. Irvine
 */
public class A034747 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Jaguar.factor(mN / d).sigma().multiply(Fibonacci.fibonacci(d)));
    }
    return sum;
  }
}
