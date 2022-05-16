package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034748 Dirichlet convolution of Fibonacci numbers with phi(n).
 * @author Sean A. Irvine
 */
public class A034748 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Jaguar.factor(mN / d).phi().multiply(Fibonacci.fibonacci(d)));
    }
    return sum;
  }
}
