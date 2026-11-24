package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087545 a(0) = 0, a(1) = 1, a(n) = smallest multiple of n beginning with the sum of two previous terms.
 * @author Sean A. Irvine
 */
public class A087545 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private long mN = 1;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return mA;
      }
      mB = Z.ONE;
      return Z.ONE;
    }
    ++mN;
    Z t = mA.add(mB);
    if (t.mod(mN) == 0) {
      mA = mB;
      mB = t;
      return t;
    }
    long lim = 1;
    long k = 1;
    while (k >= lim) {
      t = t.multiply(10);
      lim *= 10;
      k = (mN - t.mod(mN)) % mN;
    }
    mA = mB;
    mB = t.add(k);
    return mB;
  }
}
