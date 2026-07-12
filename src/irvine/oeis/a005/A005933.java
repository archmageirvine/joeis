package irvine.oeis.a005;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005933 Theta series of laminated lattice LAMBDA_9.
 * @author Sean A. Irvine
 */
public class A005933 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> theta3 = ThetaFunctions.theta3z(mN);
    final Polynomial<Z> theta4 = ThetaFunctions.theta4z(mN);
    return RING.pow(theta3, 9, mN).coeff(mN)
      .subtract(RING.multiply(RING.pow(theta3, 5, mN), RING.pow(theta4, 4, mN), mN).coeff(mN))
      .add(RING.multiply(theta3, RING.pow(theta4, 8, mN), mN).coeff(mN)
        .add(RING.pow(theta4, 9, mN).coeff(mN)).divide2());
  }
}
