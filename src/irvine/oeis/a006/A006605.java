package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006605 Number of modes of connections of <code>2n</code> points.
 * @author Sean A. Irvine
 */
public class A006605 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= 2 * mN + 1; ++k) {
      sum = sum.add(Binomial.binomial(k, 2 * k - 2 - 3 * mN).multiply(Binomial.binomial(2 * mN + 1, k)));
    }
    return sum.divide(2 * mN + 1);
  }
}

