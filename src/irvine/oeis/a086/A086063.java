package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086063 a(n) = if n&lt;=1 then 1 else smallest k&gt;1 such that in binary representation n is contained in n^k.
 * @author Sean A. Irvine
 */
public class A086063 extends Sequence0 {

  private long mN = -1;
  private long mLim = 4;

  private boolean is(Z t) {
    while (!t.isZero()) {
      if (t.mod(mLim) == mN) {
        return true;
      }
      t = t.divide2();
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    if (mN >= mLim) {
      mLim *= 2;
    }
    long k = 1;
    Z t = Z.valueOf(mN);
    while (true) {
      ++k;
      t = t.multiply(mN);
      if (is(t)) {
        return Z.valueOf(k);
      }
    }
  }
}
