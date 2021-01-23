package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A034685 Least possible integer k/(product of digits k) for k with n digits.
 * @author Sean A. Irvine
 */
public class A034685 implements Sequence {

  private long mLim = 1;
  private long mN = 0;

  @Override
  public Z next() {
    mLim *= 10;
    long min = Long.MAX_VALUE;
    while (mN < mLim) {
      final long d = ZUtils.digitProduct(mN);
      if (d != 0 && mN / d < min && mN % d == 0) {
        min = mN / d;
      }
      ++mN;
    }
    return Z.valueOf(min);
  }
}
