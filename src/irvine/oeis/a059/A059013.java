package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059013 Odd number of 0's and even number of 1's in binary expansion.
 * @author Sean A. Irvine
 */
public class A059013 implements Sequence {

  private long mN = -1;
  private long mM = 0;
  private long mLim = 1;

  @Override
  public Z next() {
    if (mN == -1) {
      mN = 0;
      return Z.ZERO;
    }
    while (true) {
      if (++mN == mLim) {
        mLim *= 2;
        ++mM;
      }
      final int cnt = Long.bitCount(mN);
      if ((cnt & 1) == 0 && ((mM - cnt) & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}

