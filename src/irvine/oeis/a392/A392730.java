package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392730 allocated for Ctibor O. Zizka.
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
