package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a001.A001694;

/**
 * A062762 Number of powerful numbers not exceeding 2^n.
 * @author Sean A. Irvine
 */
public class A062762 extends A001694 {

  private Z mA = super.next();
  private Z mLim = null;
  private long mCnt = 0;

  @Override
  public Z next() {
    mLim = mLim == null ? Z.ONE : mLim.multiply2();
    while (mA.compareTo(mLim) <= 0) {
      ++mCnt;
      mA = super.next();
    }
    return Z.valueOf(mCnt);
  }
}

