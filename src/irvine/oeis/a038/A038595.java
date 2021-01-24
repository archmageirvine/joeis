package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a181.A181123;

/**
 * A038595 Numbers n such that n and n-1 are differences between 2 positive cubes in at least one way.
 * @author Sean A. Irvine
 */
public class A038595 extends A181123 {

  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = mPrev;
      mPrev = super.next();
      if (t.add(1).equals(mPrev)) {
        return mPrev;
      }
    }
  }
}
