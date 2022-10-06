package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a006.A006753;

/**
 * A059754 Smallest term in any sequence of n consecutive Smith numbers (A006753).
 * @author Sean A. Irvine
 */
public class A059754 extends A006753 {

  private int mN = 0;
  private Z mStart = null;
  private Z mCurrent = super.next();
  private int mRunLength = 0;

  @Override
  public Z next() {
    ++mN;
    while (mRunLength < mN) {
      mStart = mCurrent;
      mRunLength = 0;
      do {
        ++mRunLength;
        mCurrent = super.next();
      } while (mStart.add(mRunLength).equals(mCurrent));
    }
    return mStart;
  }
}
