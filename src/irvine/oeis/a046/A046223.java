package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046223 First denominator and then numerator of central elements of 1/2-Pascal triangle.
 * @author Sean A. Irvine
 */
public class A046223 extends A046213 {

  private boolean mNumerator = true;
  private long mN = -2;

  @Override
  public Z next() {
    mNumerator = !mNumerator;
    if (mNumerator) {
      return get(mN, mN / 2).num();
    } else {
      mN += 2;
      return get(mN, mN / 2).den();
    }
  }
}
