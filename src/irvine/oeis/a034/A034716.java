package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034716 Dirichlet convolution of factorials with themselves.
 * @author Sean A. Irvine
 */
public class A034716 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Functions.FACTORIAL.z(d).multiply(Functions.FACTORIAL.z(mN / d)));
    }
    return sum;
  }
}
