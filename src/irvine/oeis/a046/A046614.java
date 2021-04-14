package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046614 First denominator and then numerator of the elements to the right of the central elements of the 1/5-Pascal triangle.
 * @author Sean A. Irvine
 */
public class A046614 extends A046601 {

  private boolean mNumerator = true;
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    mNumerator = !mNumerator;
    if (mNumerator) {
      return get(mN, mM).num();
    } else {
      if (++mM > mN) {
        ++mN;
        mM = (mN + 2) / 2;
      }
      return get(mN, mM).den();
    }
  }
}
