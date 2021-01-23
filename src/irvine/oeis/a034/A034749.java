package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Binomial;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034749 Dirichlet convolution of Fibonacci numbers with Catalan numbers.
 * @author Sean A. Irvine
 */
public class A034749 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Binomial.catalan(mN / d - 1).multiply(Fibonacci.fibonacci(d)));
    }
    return sum;
  }
}
