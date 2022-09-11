package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059014 Numbers that have an even number of 0's and an odd number of 1's in binary expansion.
 * @author Sean A. Irvine
 */
public class A059014 implements Sequence {

  private long mN = 0;
  private long mM = 0;
  private long mLim = 1;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLim) {
        mLim *= 2;
        ++mM;
      }
      final int cnt = Long.bitCount(mN);
      if ((cnt & 1) == 1 && ((mM - cnt) & 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

