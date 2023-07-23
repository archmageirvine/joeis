package irvine.oeis.a346;

import irvine.math.z.Z;
import irvine.oeis.a076.A076478;

/**
 * A346303 Positions of words in A076478 that start with 0 and end with 0.
 * @author Sean A. Irvine
 */
public class A346303 extends A076478 {

  {
    setOffset(1);
  }

  private long mN = 1;
  private long mMask = 0;
  private long mLim = 2;
  private int mBits = -1; // excluding leading 1

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLim) {
        mLim *= 2;
        mMask = (mMask << 1) + 1;
        ++mBits;
      }
      if ((mN & 1) == 0 && ((mN >>> mBits) & 1) == 0) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
