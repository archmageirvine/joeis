package irvine.oeis.a045;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045629 Number of <code>2n-bead black-white</code> complementable necklaces with n black beads.
 * @author Sean A. Irvine
 */
public class A045629 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValueExact();
      sum = sum.add(Binomial.binomial(2L * d - 1, d - 1).multiply(LongUtils.phi(mN / d)));
      sum = sum.add(Z.ONE.shiftLeft(d - 1).multiply(LongUtils.phi(2L * (mN / d))));
    }
    return sum.divide(2 * mN);
  }
}
