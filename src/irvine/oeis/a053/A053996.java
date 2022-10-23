package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053996 Number of bases of n-dimensional vector space over GF(4).
 * @author Sean A. Irvine
 */
public class A053996 extends Sequence0 {

  private int mN = -1;
  private Z mA = Z.ONE;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(4);
      mF = mF.multiply(mN);
    }
    Z prod = Z.ONE;
    Z t = Z.ONE;
    for (int k = 0; k < mN; ++k, t = t.shiftLeft(2)) {
      prod = prod.multiply(mA.subtract(t));
    }
    return prod.divide(mF);
  }
}
