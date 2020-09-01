package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034772 Dirichlet convolution of d(n) (number of divisors) with Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A034772 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Cheetah.factor(mN / d).sigma0().multiply(Fibonacci.fibonacci(d)));
    }
    return sum;
  }
}
