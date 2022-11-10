package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060323 The first n digits of n! form a prime number.
 * @author Sean A. Irvine
 */
public class A060323 extends Sequence1 {

  private Z mF = Z.ONE;
  private int mN = 1;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      if (mN % 5 == 0) {
        mF = mF.divide(10);
        Z[] qr;
        while (true) {
          qr = mF.divideAndRemainder(Z.TEN);
          if (!qr[1].isZero()) {
            break;
          }
          mF = qr[0];
        }
      }
      final String s = mF.toString();
      if (s.length() >= mN && new Z(s.substring(0, mN)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
