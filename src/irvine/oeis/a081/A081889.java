package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.a306.A306252;

/**
 * A081889 Least primitive root corresponding to A081888(n).
 * @author Sean A. Irvine
 */
public class A081889 extends A306252 {

  private Z mLeast = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.compareTo(mLeast) > 0) {
        mLeast = t;
        return t;
      }
    }
  }
}
