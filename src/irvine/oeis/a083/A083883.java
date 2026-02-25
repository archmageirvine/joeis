package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.a081.A081874;

/**
 * A083883 Odd short leg of more than one primitive Pythagorean triangle.
 * @author Sean A. Irvine
 */
public class A083883 extends A081874 {

  private Z mPrev = Z.ZERO;
  private Z mLast = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = mPrev;
      mPrev = super.next();
      if (t.equals(mPrev) && !mLast.equals(t)) {
        mLast = t;
        return t;
      }
    }
  }
}
