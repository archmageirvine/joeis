package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046610 First numerator and then denominator of the central elements of the 1/5-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046610 extends A046601 {

  private boolean mNumerator = false;
  private long mN = -2;

  @Override
  public Z next() {
    mNumerator = !mNumerator;
    if (mNumerator) {
      mN += 2;
    }
    return mNumerator ? get(mN, mN / 2).num() : get(mN, mN / 2).den();
  }
}
