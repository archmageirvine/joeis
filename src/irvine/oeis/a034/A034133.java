package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034133 a(n) = ceiling((n + 7/10)^3).
 * @author Sean A. Irvine
 */
public class A034133 extends A034123 {

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

