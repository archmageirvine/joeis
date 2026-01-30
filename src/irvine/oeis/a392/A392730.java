package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392730 Odd squares k such that k has an odd number of digits and the sum of digits of k is an odd number.
 * @author Sean A. Irvine
 */
public class A392730 extends Sequence1 {

  private long mN = -1;
  private long mLimit = 10;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final long s = mN * mN;
      if (s > mLimit) {
        // Skip over even length squares
        mN = Functions.SQRT.l(mLimit * 10) | 1;
        mLimit *= 100;
      } else if ((Functions.DIGIT_SUM.l(s) & 1) == 1) {
        return Z.valueOf(s);
      }
    }
  }
}
