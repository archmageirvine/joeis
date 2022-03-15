package irvine.oeis.a055;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000410;

/**
 * A055165 Number of invertible n X n matrices with entries equal to 0 or 1.
 * @author Sean A. Irvine
 */
public class A055165 extends A000410 {

  private Z mF = Z.ONE;

  @Override
  public Z next() {
    final Z t = super.next();
    mF = mF.multiply(mN);
    return Binomial.binomial((1L << mN) - 1, mN).subtract(t).multiply(mF);
  }
}
