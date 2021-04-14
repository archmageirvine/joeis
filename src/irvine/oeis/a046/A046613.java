package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046613 First numerator and then denominator of the elements to the right of the central elements of the 1/5-Pascal triangle.
 * @author Sean A. Irvine
 */
public class A046613 extends A046601 {

  private boolean mNumerator = false;
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    mNumerator = !mNumerator;
    if (mNumerator) {
      if (++mM > mN) {
        ++mN;
        mM = (mN + 2) / 2;
      }
      return get(mN, mM).num();
    } else {
      return get(mN, mM).den();
    }
  }
}
