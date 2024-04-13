package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A068898 Triangular numbers containing 2n digits in which the sum of the first n digits = that of the rest.
 * @author Sean A. Irvine
 */
public class A068898 extends Sequence1 {

  private Z mMod = Z.TEN;
  private Z mLim = Z.valueOf(100);
  private Z mR = Z.NINE;

  @Override
  public Z next() {
    while (true) {
      mR = mR.add(1);
      final Z s = mR.multiply(mR.add(1)).divide2();
      if (s.compareTo(mLim) >= 0) {
        mR = A000217.trinv(mLim.multiply(10));
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
