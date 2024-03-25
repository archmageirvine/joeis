package irvine.oeis.a068;

import irvine.math.z.CubicCongruence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068895 a(1) = 1; a(n) is the smallest cube which is congruent to 1 mod a(n-1).
 * @author Sean A. Irvine
 */
public class A068895 extends Sequence1 {

  private Z mPrev = null;

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = Z.ONE;
      return Z.ONE;
    } else if (Z.ONE.equals(mPrev)) {
      mPrev = Z.EIGHT;
      return Z.EIGHT;
    }
    for (final Z s : CubicCongruence.solve(Z.ONE, mPrev)) {
      final Z t = s.pow(3);
      if (t.compareTo(mPrev) > 0) {
        mPrev = t;
        return t;
      }
    }
    // Cube root of solution exceeds mPrev?
    Z x = mPrev;
    while (true) {
      x = x.add(1);
      if (x.modPow(Z.THREE, mPrev).equals(Z.ONE)) {
        mPrev = x.pow(3);
        return mPrev;
      }
    }
  }
}
