package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007392.
 * @author Sean A. Irvine
 */
public class A007392 extends A007387 {

  private long mN = -2;
  private boolean mAlternate = false;

  @Override
  public Z next() {
    mAlternate = !mAlternate;
    if (mAlternate) {
      mN += mN == 0 ? 3 : 2;
    }
    return super.next().subtract(mAlternate ? mN : 2);
  }
}
