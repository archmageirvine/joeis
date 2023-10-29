package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004154 a(n) = n! with trailing zeros omitted.
 * @author Sean A. Irvine
 */
public class A004154 extends Sequence0 {

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
