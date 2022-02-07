package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A054570 Prime number spiral (clockwise, West spoke).
 * @author Sean A. Irvine
 */
public class A054570 extends A000040 {

  private long mN = -1;
  private long mPi = 1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return super.next();
    }
    final long t = 4 * mN * mN + 3 * mN;
    while (mPi < t) {
      super.next();
      ++mPi;
    }
    ++mPi;
    return super.next();
  }
}
