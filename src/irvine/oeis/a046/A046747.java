package irvine.oeis.a046;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000410;

/**
 * A046747 Number of n X n rational {0,1}-matrices of determinant 0.
 * @author Sean A. Irvine
 */
public class A046747 extends A000410 {

  private Z mF = Z.ONE;

  @Override
  public Z next() {
    final Z t = super.next();
    mF = mF.multiply(mN);
    return Z.ONE.shiftLeft(mN * mN).add(t.subtract(Binomial.binomial((1L << mN) - 1, mN)).multiply(mF));
  }
}
