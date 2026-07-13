package irvine.oeis.a023;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A023942 Theta series of laminated lattice LAMBDA_20.
 * @author Sean A. Irvine
 */
public class A023942 extends Sequence0 {

  // After Steven Kotlarz

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> t3 = ThetaFunctions.theta3z(mN);
    final Polynomial<Z> t4 = ThetaFunctions.theta4z(mN);
    final Polynomial<Z> a = RING.pow(t3, 4, mN);
    final Polynomial<Z> b = RING.pow(t4, 4, mN);
    return RING.pow(b, 5, mN).coeff(mN)
      .add(RING.multiply(a, RING.pow(b, 4, mN)).coeff(mN).multiply(5))
      .subtract(RING.multiply(RING.pow(a, 2, mN), RING.pow(b, 3, mN)).coeff(mN).multiply(140))
      .add(RING.multiply(RING.pow(a, 3, mN), RING.pow(b, 2, mN)).coeff(mN).multiply(520))
      .subtract(RING.multiply(RING.pow(a, 4, mN), b).coeff(mN).multiply(640))
      .add(RING.pow(a, 5, mN).coeff(mN).multiply(256))
      .divide2();
  }
}
