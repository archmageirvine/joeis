package irvine.oeis.a152;

import irvine.math.z.Z;

/**
 * A152452.
 * @author Sean A. Irvine
 */
public class A152452 extends A152235 {

  private Z mBest = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.compareTo(mBest) > 0) {
        mBest = t;
        return t;
      }
    }
  }
}

