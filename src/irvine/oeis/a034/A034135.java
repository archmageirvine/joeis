package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034135 Decimal part of cube root of n starts with 9: first term of runs.
 * @author Sean A. Irvine
 */
public class A034135 extends A034125 {

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

