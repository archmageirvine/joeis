package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009940 <code>a(n) =</code> n!*L_{n}(1), L_{n}(x) the n-th Laguerre polynomial.
 * @author Sean A. Irvine
 */
public class A009940 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ZERO;

  @Override
  public Z next() {
    if (++mN == 0) {
      return mA;
    } else if (mN > 1) {
      final Z t = mB.multiply(2 * mN - 2).subtract(mA.multiply(mN - 1).multiply(mN - 1));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
