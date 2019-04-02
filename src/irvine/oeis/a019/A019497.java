package irvine.oeis.a019;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019497 Number of ternary search trees on n keys.
 * @author Sean A. Irvine
 */
public class A019497 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(Binomial.binomial(mN - k, k).multiply(Binomial.binomial(3 * k, mN - k - 1)).divide(mN - k));
    }
    return sum;
  }
}
