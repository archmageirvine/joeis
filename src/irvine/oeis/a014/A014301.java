package irvine.oeis.a014;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014301 Number of internal nodes of even outdegree in all ordered rooted trees with n edges.
 * @author Sean A. Irvine
 */
public class A014301 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      sum = sum.add(Binomial.binomial(2 * mN - 2 * k - 2, mN - 2));
    }
    return sum.divide2();
  }
}

