package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046226 First denominator and then numerator of elements to right of central elements of 1/2-Pascal triangle.
 * @author Sean A. Irvine
 */
public class A046226 extends A046213 {

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
