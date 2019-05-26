package irvine.oeis.a023;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023053 Number of noncrossing rooted trees with n nodes on a circle that do not have leaves at level 1.
 * @author Sean A. Irvine
 */
public class A023053 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(3 * mN - 2 * k, mN - k).multiply(k + 1).divide(2 * mN - k + 1));
    }
    return sum;
  }
}
