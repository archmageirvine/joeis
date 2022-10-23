package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034713 Dirichlet convolution of powers of 2 (2,4,8,...) with themselves.
 * @author Sean A. Irvine
 */
public class A034713 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Z.ONE.shiftLeft(d + mN / d));
    }
    return sum;
  }
}
