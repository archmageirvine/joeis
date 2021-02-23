package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039694 Twin Fibonacci-lucky numbers (upper terms).
 * @author Sean A. Irvine
 */
public class A039694 extends A039672 {

  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = mPrev;
      mPrev = super.next();
      if (t.add(2).equals(mPrev)) {
        return mPrev;
      }
    }
  }
}
