package irvine.oeis.a009;

import irvine.math.z.Z;

/**
 * A009129 Perimeter of more than one Pythagorean triangle.
 * @author Sean A. Irvine
 */
public class A009129 extends A009096 {

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
