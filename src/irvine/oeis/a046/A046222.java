package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046222 First numerator and then denominator of central elements of 1/2-Pascal triangle.
 * @author Sean A. Irvine
 */
public class A046222 extends A046213 {

  private boolean mNumerator = false;
  private long mN = -2;

  @Override
  public Z next() {
    mNumerator = !mNumerator;
    if (mNumerator) {
      mN += 2;
      return get(mN, mN / 2).num();
    } else {
      return get(mN, mN / 2).den();
    }
  }
}
