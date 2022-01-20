package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053995.
 * @author Sean A. Irvine
 */
public class A053995 implements Sequence {

  private int mN = -1;
  private Z mA = Z.ONE;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(3);
      mF = mF.multiply(mN);
    }
    Z prod = Z.ONE;
    Z t = Z.ONE;
    for (int k = 0; k < mN; ++k, t = t.multiply(3)) {
      prod = prod.multiply(mA.subtract(t));
    }
    return prod.divide(mF);
  }
}
