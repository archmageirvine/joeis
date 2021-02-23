package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039693 Twin Fibonacci-lucky numbers (lower terms).
 * @author Sean A. Irvine
 */
public class A039693 extends A039672 {

  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = mPrev;
      mPrev = super.next();
      if (t.add(2).equals(mPrev)) {
        return t;
      }
    }
  }
}
