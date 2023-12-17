package irvine.oeis.a067;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067229.
 * @author Sean A. Irvine
 */
public class A067439 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 2; k < mN; ++k) {
      if (LongUtils.gcd(mN, k) == 1) {
        sum = sum.add(mN % k);
      }
    }
    return sum;
  }
}
