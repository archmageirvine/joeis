package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008906 Number of digits in n! excluding final zeros.
 * @author Sean A. Irvine
 */
public class A008906 extends Sequence0 {

  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
      Z[] qr;
      while ((qr = mF.divideAndRemainder(Z.TEN))[1].isZero()) {
        mF = qr[0];
      }
    }
    return Z.valueOf(mF.toString().length());
  }
}
