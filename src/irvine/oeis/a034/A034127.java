package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034127 Decimal part of cube root of <code>a(n)</code> starts with <code>1</code>: first term of runs.
 * @author Sean A. Irvine
 */
public class A034127 extends A034117 {

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

