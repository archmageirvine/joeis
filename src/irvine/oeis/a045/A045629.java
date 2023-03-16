package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Binomial;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A045629 Number of 2n-bead black-white complementable necklaces with n black beads.
 * @author Sean A. Irvine
 */
public class A045629 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValueExact();
      sum = sum.add(Binomial.binomial(2L * d - 1, d - 1).multiply(Euler.phiAsLong(mN / d)));
      sum = sum.add(Z.ONE.shiftLeft(d - 1).multiply(Euler.phiAsLong(2L * (mN / d))));
    }
    return sum.divide(2 * mN);
  }
}
