package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A034686 a(n) = k, where k/(product of digits of k) is least possible integer for k with n digits.
 * @author Sean A. Irvine
 */
public class A034686 implements Sequence {

  private long mLim = 1;
  private long mN = 0;

  @Override
  public Z next() {
    mLim *= 10;
    long min = Long.MAX_VALUE;
    long minN = 0;
    while (mN < mLim) {
      final long d = ZUtils.digitProduct(mN);
      if (d != 0 && mN / d < min && mN % d == 0) {
        min = mN / d;
        minN = mN;
      }
      ++mN;
    }
    return Z.valueOf(minN);
  }
}
