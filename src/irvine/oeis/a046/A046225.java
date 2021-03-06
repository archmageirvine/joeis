package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046225 First numerator and then denominator of elements to right of central elements of 1/2-Pascal triangle.
 * @author Sean A. Irvine
 */
public class A046225 extends A046213 {

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
