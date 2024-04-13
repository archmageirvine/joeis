package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034685 Least possible integer k/(product of digits k) for k with n digits.
 * @author Sean A. Irvine
 */
public class A034685 extends Sequence1 {

  private long mLim = 1;
  private long mN = 0;

  @Override
  public Z next() {
    mLim *= 10;
    long min = Long.MAX_VALUE;
    while (mN < mLim) {
      final long d = Functions.DIGIT_PRODUCT.l(mN);
      if (d != 0 && mN / d < min && mN % d == 0) {
        min = mN / d;
      }
      ++mN;
    }
    return Z.valueOf(min);
  }
}
