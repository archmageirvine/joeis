package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034713 Dirichlet convolution of powers of 2 (2,4,8,...) with themselves.
 * @author Sean A. Irvine
 */
public class A034713 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Z.ONE.shiftLeft(d + mN / d));
    }
    return sum;
  }
}
