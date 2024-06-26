package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034748 Dirichlet convolution of Fibonacci numbers with phi(n).
 * @author Sean A. Irvine
 */
public class A034748 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Functions.PHI.z(mN / d).multiply(Functions.FIBONACCI.z(d)));
    }
    return sum;
  }
}
