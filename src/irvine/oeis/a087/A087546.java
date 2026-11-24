package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087546 a(1) = 1, a(2) = 2, a(n) = smallest multiple of n beginning with the product of two previous terms.
 * @author Sean A. Irvine
 */
public class A087546 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;
  private long mN = 2;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return mA;
      }
      mB = Z.TWO;
      return Z.TWO;
    }
    ++mN;
    Z t = mA.multiply(mB);
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
