package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034734 Dirichlet convolution of b_n=2^(n-1) with Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A034734 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Functions.FIBONACCI.z(mN / d).shiftLeft(d - 1));
    }
    return sum;
  }
}
