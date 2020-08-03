package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034112 Decimal part of square root of <code>a(n)</code> starts with <code>6</code>: first term of runs.
 * @author Sean A. Irvine
 */
public class A034112 extends A034102 {

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

