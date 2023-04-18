package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a091.A091661;

/**
 * A063006 Coefficients in a 10-adic square root of 1.
 * @author Sean A. Irvine
 */
public class A063006 extends A091661 {

  private Z mT = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z m = mT;
    mT = mT.multiply(10);
    return mT.add(a(6, mN)).subtract(a(5, mN)).divide(m).mod(Z.TEN);
  }
}
