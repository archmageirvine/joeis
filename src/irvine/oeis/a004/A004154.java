package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004154 Omit trailing zeros from factorial numbers.
 * @author Sean A. Irvine
 */
public class A004154 implements Sequence {

  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
      if (mN % 5 == 0) {
        Z[] qr;
        while ((qr = mF.divideAndRemainder(Z.TEN))[1].isZero()) {
          mF = qr[0];
        }
      }
    }
    return mF;
  }
}
