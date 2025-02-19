package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068897 Squares containing 2k digits in which the sum of the first k digits = that of the rest.
 * @author Sean A. Irvine
 */
public class A068897 extends Sequence1 {

  private Z mMod = Z.TEN;
  private Z mLim = Z.valueOf(100);
  private Z mR = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mR = mR.add(1);
      final Z s = mR.square();
      if (s.compareTo(mLim) >= 0) {
        mR = mLim.multiply(10).sqrt();
        mLim = mLim.multiply(100);
        mMod = mMod.multiply(10);
      } else {
        final Z[] qr = s.divideAndRemainder(mMod);
        if (Functions.DIGIT_SUM.l(qr[0]) == Functions.DIGIT_SUM.l(qr[1])) {
          return s;
        }
      }
    }
  }
}
