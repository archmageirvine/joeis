package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046573 First denominator and then numerator of the central elements of the 1/4-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046573 extends A046568 {

  private boolean mNumerator = true;
  private long mN = -2;

  @Override
  public Z next() {
    mNumerator = !mNumerator;
    if (!mNumerator) {
      mN += 2;
    }
    return mNumerator ? get(mN, mN / 2).num() : get(mN, mN / 2).den();
  }
}
