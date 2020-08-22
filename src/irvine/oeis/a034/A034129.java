package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034129 Decimal part of cube root of a(n) starts with 3: first term of runs.
 * @author Sean A. Irvine
 */
public class A034129 extends A034119 {

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

