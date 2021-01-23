package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034106 Fractional part of square root of n starts with 0: first term of runs (squares excluded).
 * @author Sean A. Irvine
 */
public class A034106 extends A034096 {

  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = mPrev;
      mPrev = super.next();
      if (!mPrev.equals(t.add(1))) {
        return mPrev;
      }
    }
  }
}

