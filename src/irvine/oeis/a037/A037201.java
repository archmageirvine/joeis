package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A037201 Differences between consecutive primes (A001223) but with repeats omitted.
 * @author Sean A. Irvine
 */
public class A037201 extends A001223 {

  private Z mPrev = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = mPrev;
      mPrev = super.next();
      if (!t.equals(mPrev)) {
        return mPrev;
      }
    }
  }
}
