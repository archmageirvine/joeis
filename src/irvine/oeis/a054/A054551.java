package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A054551 Prime number spiral (clockwise, North spoke).
 * @author Sean A. Irvine
 */
public class A054551 extends A000040 {

  {
    setOffset(0);
  }

  private long mN = -1;
  private long mPi = 0;

  @Override
  public Z next() {
    final long t = ++mN * mN * 4 - 3 * mN;
    while (mPi < t) {
      super.next();
      ++mPi;
    }
    ++mPi;
    return super.next();
  }
}
