package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034750 Dirichlet convolution of Fibonacci numbers with Bell numbers.
 * @author Sean A. Irvine
 */
public class A034750 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(BellNumbers.bell(mN / d - 1).multiply(Functions.FIBONACCI.z((long) d)));
    }
    return sum;
  }
}
