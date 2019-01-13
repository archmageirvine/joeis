package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010754.
 * @author Sean A. Irvine
 */
public class A010754 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 4; ++k) {
      sum = sum.add(Binomial.binomial(mN - k, k));
    }
    return sum;
  }
}
