package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006343.
 * @author Sean A. Irvine
 */
public class A006343 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 0; 2 * k <= mN - 2; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(Binomial.binomial(2 * mN - 3 * k - 4, mN - 2 * k - 2)).divide(mN - k - 1));
    }
    return sum;
  }
}

