package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004125 Sum of remainders of n mod k, for k = 1, 2, 3, ..., n.
 * @author Sean A. Irvine
 */
public class A004125 extends Sequence1 {

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
