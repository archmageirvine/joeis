package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067248 Numbers k such that the digits of prime(k) end in k.
 * @author Sean A. Irvine
 */
public class A067248 extends A000040 {

  private long mN = 0;
  private long mLim = 10;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLim) {
        mLim *= 10;
      }
      if (super.next().mod(mLim) == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}

