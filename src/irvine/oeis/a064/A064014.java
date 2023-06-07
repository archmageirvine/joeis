package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064014 Squares with an even number of digits, the respective halves of which are consecutive integers.
 * @author Sean A. Irvine
 */
public class A064014 extends Sequence1 {

  private long mN = 90;
  private Z mD = Z.valueOf(100);
  private Z mLim = Z.valueOf(10000);

  @Override
  public Z next() {
    while (true) {
      final Z s = Z.valueOf(++mN).square();
      if (s.compareTo(mLim) >= 0) {
        mN = mLim.multiply(10).sqrt().longValueExact() + 1;
        mLim = mLim.multiply(100);
        mD = mD.multiply(10);
      }
      final Z[] qr = s.divideAndRemainder(mD);
      if (qr[0].subtract(qr[1]).abs().equals(Z.ONE)) {
        return s;
      }
    }
  }
}
