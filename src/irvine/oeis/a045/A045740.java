package irvine.oeis.a045;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045740 Number of components in all forests on nodes on a circle.
 * @author Sean A. Irvine
 */
public class A045740 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k - 1).multiply(k).multiply(Binomial.binomial(3 * mN - 2 * k - 1, mN - k)).divide(2 * mN - k));
    }
    return sum;
  }
}
