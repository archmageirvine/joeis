package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067102.
 * @author Sean A. Irvine
 */
public class A067106 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long m = mN;
    while ((m & 1) == 0) {
      mA = mA.multiply2();
      m /= 2;
    }
    while (m % 3 == 0) {
      mA = mA.multiply(3);
      m /= 3;
    }
    while (m % 5 == 0) {
      mA = mA.multiply(5);
      m /= 5;
    }
    while (m % 7 == 0) {
      mA = mA.multiply(7);
      m /= 7;
    }
    Z s = Z.ZERO;
    Z b = Z.ONE;
    Z t = mA;
    Z k = Z.NINE;
    while (t.compareTo(Z.ONE) > 0) {
      final Z[] qr = t.divideAndRemainder(k);
      if (qr[1].isZero()) {
        s = s.add(k.multiply(b));
        t = qr[0];
        b = b.multiply(10);
      } else {
        k = k.subtract(1);
      }
    }
    return s;
  }
}
