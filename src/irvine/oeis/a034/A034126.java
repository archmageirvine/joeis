package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034126 Decimal part of cube root of <code>a(n)</code> starts with <code>0</code>: first term of runs (cubes excluded).
 * @author Sean A. Irvine
 */
public class A034126 extends A034116 {

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

