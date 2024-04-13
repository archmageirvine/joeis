package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A064154 Numbers whose product of digits equals the number of digits times the sum of digits.
 * @author Sean A. Irvine
 */
public class A064154 extends Sequence1 {

  private long mN = -1;
  private long mDigits = 1;
  private long mLimit = 10;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLimit) {
        mLimit *= 10;
        ++mDigits;
      }
      if (ZUtils.digitProduct(mN) == Functions.DIGIT_SUM.l(mN) * mDigits) {
        return Z.valueOf(mN);
      }
    }
  }
}
