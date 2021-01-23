package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034113 Fractional part of square root of a(n) starts with 7: first term of runs.
 * @author Sean A. Irvine
 */
public class A034113 extends A034103 {

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

