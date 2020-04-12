package irvine.oeis.a030;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030980 Number of planted noncrossing bushes with n nodes; i.e., rooted noncrossing trees with n nodes, root degree 1 and no nonroot nodes of degree 1.
 * @author Sean A. Irvine
 */
public class A030980 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.signedAdd(((mN - k) & 1) == 0, Binomial.binomial(mN, k).multiply(Binomial.binomial(3 * k - 2, k - 1)).shiftLeft(mN - k));
    }
    return sum.divide(mN);
  }
}
