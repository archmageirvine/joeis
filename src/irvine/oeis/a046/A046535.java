package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046535 First denominator and then numerator of each element of the 1/3-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046535 extends A046534 {

  private boolean mNumerator = true;
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    mNumerator = !mNumerator;
    if (!mNumerator && ++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mNumerator ? get(mN, mM).num() : get(mN, mM).den();
  }
}
