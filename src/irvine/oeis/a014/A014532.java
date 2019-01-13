package irvine.oeis.a014;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014532.
 * @author Sean A. Irvine
 */
public class A014532 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= (mN - 1) / 2; ++k) {
      sum = sum.add(Binomial.binomial(mN + 2, mN - 1 - k).multiply(Binomial.binomial(mN - 1 - k, k)));
    }
    return sum;
  }
}
