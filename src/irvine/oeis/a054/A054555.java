package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A054555 Prime number spiral (clockwise, East spoke).
 * @author Sean A. Irvine
 */
public class A054555 extends A000040 {

  private long mN = 0;
  private long mPi = 1;

  @Override
  public Z next() {
    if (++mN == 1) {
      return super.next();
    }
    final long t = mN * mN * 4 - 9 * mN + 5;
    while (mPi < t) {
      super.next();
      ++mPi;
    }
    ++mPi;
    return super.next();
  }
}
