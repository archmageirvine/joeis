package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068894 a(1) = 1; a(n) is the smallest n-th power which is congruent to 1 mod a(n-1).
 * @author Sean A. Irvine
 */
public class A068894 extends Sequence1 {

  private int mN = 0;
  private Z mPrev = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long k = 1;
    final Z n = Z.valueOf(mN);
    final Z m = Z.ONE.mod(mPrev);
    while (true) {
      final Z t = Z.valueOf(++k);
      if (t.modPow(n, mPrev).equals(m)) {
        mPrev = t.pow(n);
        return mPrev;
      }
    }
  }
}
