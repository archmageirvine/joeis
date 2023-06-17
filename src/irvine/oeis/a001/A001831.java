package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001831 Number of labeled graded partially ordered sets with n elements of height at most 1.
 * @author Sean A. Irvine
 */
public class A001831 extends AbstractSequence {

  /** Construct the sequence. */
  public A001831() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      s = s.add(Binomial.binomial(mN, k).multiply(Z.ONE.shiftLeft(k).subtract(1).pow(mN - k)));
    }
    return s;
  }
}
