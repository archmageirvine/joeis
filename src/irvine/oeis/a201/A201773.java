package irvine.oeis.a201;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;
import irvine.oeis.a000.A000796;

/**
 * A201773.
 * @author Sean A. Irvine
 */
public class A201773 extends A000045 {

  private final A000796 mPi = new A000796();
  private int mPiDigit;
  private long mPiPos = 0;

  @Override
  public Z next() {
    final Z fibo = super.next();
    final long f = fibo.longValueExact();
    if (f == 0) {
      return Z.ZERO;
    }
    while (mPiPos < f) {
      mPiDigit = mPi.next().intValue();
      ++mPiPos;
    }
    return new Z(String.valueOf(f) + String.valueOf(mPiDigit));
  }
}
