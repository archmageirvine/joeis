package irvine.oeis.a091;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A091661 Coefficients in a 10-adic square root of 1.
 * @author Sean A. Irvine
 */
public class A091661 extends Sequence0 {

  // After Seiichi Manyama

  private Z mT = Z.ONE;
  private int mN = -1;

  protected Z a(final long s, final long n) {
    Z res = Z.valueOf(s);
    Z m10 = Z.TEN;
    for (int i = 0; i < n; ++i) {
      final Z m = m10;
      m10 = m.multiply(10);
      for (int j = 0; j <= 9; ++j) {
        final Z k = m.multiply(j).add(res);
        if (k.square().subtract(k).mod(m10).isZero()) {
          res = k;
          break;
        }
      }
    }
    return res;
  }

  @Override
  public Z next() {
    ++mN;
    final Z m = mT;
    mT = mT.multiply(10);
    return mT.add(a(5, mN)).subtract(a(6, mN)).divide(m).mod(Z.TEN);
  }
}
