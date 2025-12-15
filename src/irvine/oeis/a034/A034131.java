package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034131 a(n) = ceiling((n + 1/2)^3).
 * @author Sean A. Irvine
 */
public class A034131 extends A034121 {

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

