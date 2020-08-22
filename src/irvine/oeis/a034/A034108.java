package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034108 Decimal part of square root of a(n) starts with 2: first term of runs.
 * @author Sean A. Irvine
 */
public class A034108 extends A034098 {

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

