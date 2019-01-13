package irvine.oeis.a009;

import irvine.math.z.Z;

/**
 * A009185.
 * @author Sean A. Irvine
 */
public class A009185 extends A009012 {

  private boolean mChanged = false;
  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z a = mPrev;
      mPrev = super.next();
      if (a.equals(mPrev)) {
        if (mChanged) {
          mChanged = false;
          return a;
        }
      } else {
        mChanged = true;
      }
    }
  }
}
