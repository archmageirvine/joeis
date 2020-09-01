package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034771 Dirichlet convolution of d(n) (# of divisors) with b_n=2^(n-1).
 * @author Sean A. Irvine
 */
public class A034771 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Cheetah.factor(mN / d).sigma0().shiftLeft(d - 1));
    }
    return sum;
  }
}
