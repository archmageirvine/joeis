package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.BellNumbers;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034750 Dirichlet convolution of Fibonacci numbers with Bell numbers.
 * @author Sean A. Irvine
 */
public class A034750 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(BellNumbers.bell(mN / d - 1).multiply(Fibonacci.fibonacci(d)));
    }
    return sum;
  }
}
