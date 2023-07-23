package irvine.oeis.a346;

import irvine.math.z.Z;
import irvine.oeis.a076.A076478;

/**
 * A346300 Positions of words in A076478 in which #0's &gt; #1's.
 * @author Sean A. Irvine
 */
public class A346300 extends A076478 {

  {
    setOffset(1);
  }

  private long mN = 1;
  private long mMask = 0;
  private long mLim = 2;
  private int mBits = 0; // excluding leading 1

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLim) {
        mLim *= 2;
        mMask = (mMask << 1) + 1;
        ++mBits;
      }
      final int ones = Long.bitCount(mN) - 1; // drop leading one
      final int zeros = mBits - ones;
      if (zeros > ones) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
