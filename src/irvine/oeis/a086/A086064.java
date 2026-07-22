package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086064 In decimal representation: smallest k&gt;1 such that n is a substring of n*k.
 * @author Sean A. Irvine
 */
public class A086064 extends Sequence0 {

  private long mN = -1;
  private long mLim = 10;

  private boolean is(Z t) {
    while (!t.isZero()) {
      if (t.mod(mLim) == mN) {
        return true;
      }
      t = t.divide(10);
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    if (mN >= mLim) {
      mLim *= 10;
    }
    long k = 1;
    Z t = Z.valueOf(mN);
    while (true) {
      ++k;
      t = t.add(mN);
      if (is(t)) {
        return Z.valueOf(k);
      }
    }
  }
}
