package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a058.A058128;

/**
 * A059522 a(1) = 1, then a(n) = n*(n^(n-1)-1)*(n-2)!/(n-1).
 * @author Sean A. Irvine
 */
public class A059522 extends A058128 {

  private Z mF = Z.ONE;

  @Override
  public Z next() {
    final Z t = super.next();
    if (mN > 1) {
      mF = mF.multiply(mN - 1);
    }
    return t.multiply(mF);
  }
}
