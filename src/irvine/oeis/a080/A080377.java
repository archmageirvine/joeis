package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A080377 Prime gaps where A080374 increases.
 * @author Sean A. Irvine
 */
public class A080377 extends A001223 {

  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z g = super.next();
      final Z t = mLcm.lcm(g);
      if (t.compareTo(mLcm) > 0) {
        mLcm = t;
        return g;
      }
    }
  }
}
