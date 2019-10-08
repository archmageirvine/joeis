package irvine.oeis.a026;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026641 Number of nodes of even outdegree (including leaves) in all ordered trees with n edges.
 * @author Sean A. Irvine
 */
public class A026641 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      sum = sum.add(Binomial.binomial(mN + k, mN - k).multiply(Binomial.binomial(mN - k, k)));
    }
    return sum;
  }
}
