package irvine.oeis.a082;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082576 Numbers k such that k^k has final digits the same as all the digits of k.
 * @author Sean A. Irvine
 */
public class A082576 extends Sequence1 {

  private long mN = 0;
  private long mLim = 10;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLim) {
        mLim *= 10;
      }
      if (LongUtils.modPow(mN, mN, mLim) == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
