package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004125 Sum of remainders of <code>n mod k,</code> for <code>k = 1, 2, 3, ..., n</code>.
 * @author Sean A. Irvine
 */
public class A004125 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k < mN; ++k) {
      sum = sum.add(mN % k);
    }
    return sum;
  }
}
