package irvine.oeis.a010;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010758.
 * @author Sean A. Irvine
 */
public class A010758 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1 + mN / 4; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN - k, k));
    }
    return sum;
  }
}
