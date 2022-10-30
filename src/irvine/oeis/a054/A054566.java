package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A054566 Prime number spiral (clockwise, South spoke).
 * @author Sean A. Irvine
 */
public class A054566 extends A000040 {

  {
    setOffset(0);
  }

  private long mN = 0;
  private long mPi = 1;

  @Override
  public Z next() {
    if (++mN == 1) {
      return super.next();
    }
    final long t = 4 * mN * mN - 7 * mN + 3;
    while (mPi < t) {
      super.next();
      ++mPi;
    }
    ++mPi;
    return super.next();
  }
}
