package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010752 Sum along upward diagonal of Pascal triangle to center.
 * @author Sean A. Irvine
 */
public class A010752 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 3; ++k) {
      sum = sum.add(Binomial.binomial(mN - k, k));
    }
    return sum;
  }
}
