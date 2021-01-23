package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034109 Fractional part of square root of a(n) starts with 3: first term of runs.
 * @author Sean A. Irvine
 */
public class A034109 extends A034099 {

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

