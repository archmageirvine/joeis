package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034770 Dirichlet convolution of Bell numbers with themselves.
 * @author Sean A. Irvine
 */
public class A034770 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Functions.BELL.z(mN / d - 1).multiply(Functions.BELL.z(d - 1)));
    }
    return sum;
  }
}
