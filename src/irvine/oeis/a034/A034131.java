package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034131 Decimal part of cube root of a(n) starts with 5: first term of runs.
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

