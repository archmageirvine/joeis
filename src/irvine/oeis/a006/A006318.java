package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006318 Large Schr\u00f6der numbers (or large Schroeder numbers, or big Schroeder numbers).
 * @author Sean A. Irvine
 */
public class A006318 extends AbstractSequence {

  /** Construct the sequence. */
  public A006318() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(Binomial.binomial(mN, k - 1)).shiftLeft(k));
    }
    return sum.divide(mN);
  }
}

