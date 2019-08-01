package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024998.
 * @author Sean A. Irvine
 */
public class A024998 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN / 2; ++k) {
      sum = sum.add(Binomial.binomial(mN - 1, 2 * k - 1).multiply(Binomial.binomial(2 * k + 1, k)));
    }
    return sum;
  }
}
