package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006523.
 * @author Sean A. Irvine
 */
public class A006523 implements Sequence {

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 1) {
      mF = mF.multiply(2 * mN - 1).multiply(2 * mN - 2).multiply(2 * mN - 3).multiply(2 * mN - 4);
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 1, Binomial.binomial(mN, k).multiply(mF).shiftLeft(k));
    }
    return sum;
  }
}
