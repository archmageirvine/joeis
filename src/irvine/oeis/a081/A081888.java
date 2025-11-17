package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.a306.A306252;

/**
 * A081888 Numbers n such that the least positive primitive root of n is larger than the value for all positive numbers smaller than n.
 * @author Sean A. Irvine
 */
public class A081888 extends A306252 {

  private Z mLeast = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (mN != 2 && t.compareTo(mLeast) > 0) {
        mLeast = t;
        return Z.valueOf(mN);
      }
    }
  }
}
