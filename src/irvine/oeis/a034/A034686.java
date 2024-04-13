package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034686 a(n) = k, where k/(product of digits of k) is least possible integer for k with n digits.
 * @author Sean A. Irvine
 */
public class A034686 extends Sequence1 {

  private long mLim = 1;
  private long mN = 0;

  @Override
  public Z next() {
    mLim *= 10;
    long min = Long.MAX_VALUE;
    long minN = 0;
    while (mN < mLim) {
      final long d = Functions.DIGIT_PRODUCT.l(mN);
      if (d != 0 && mN / d < min && mN % d == 0) {
        min = mN / d;
        minN = mN;
      }
      ++mN;
    }
    return Z.valueOf(minN);
  }
}
