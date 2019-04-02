package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007863 Number of hybrid binary trees with n internal nodes.
 * @author Sean A. Irvine
 */
public class A007863 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN + k, mN).multiply(Binomial.binomial(mN + k + 1, mN - k)));
    }
    return sum.divide(mN + 1);
  }
}
