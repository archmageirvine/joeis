package irvine.oeis.a006;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006910 Theta series of laminated lattice LAMBDA_11^{min}.
 * @author Sean A. Irvine
 */
public class A006910 extends Sequence0 {

  // After Steven Kotlarz

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final QPolynomial<Z> t2 = ThetaFunctions.theta2(mN);
    final QPolynomial<Z> t2x2 = t2.substitutePower(2, Q.valueOf(mN));
    final QPolynomial<Z> t3 = ThetaFunctions.theta3(mN);
    final QPolynomial<Z> t3x2 = t3.substitutePower(2, Q.valueOf(mN));
    final QPolynomial<Z> t4 = ThetaFunctions.theta4(mN);
    final QPolynomial<Z> t4x2 = t4.substitutePower(2, Q.valueOf(mN));
    return RING.pow(t3x2, 11, mN).coeff(mN)
      .add(RING.multiply(RING.pow(t3x2, 7, mN), RING.pow(t2x2, 4, mN)).coeff(mN).multiply(26))
      .add(RING.multiply(RING.pow(t3x2, 5, mN), RING.pow(t2x2, 6, mN)).coeff(mN).multiply(24))
      .add(RING.multiply(RING.pow(t3x2, 3, mN), RING.pow(t2x2, 8, mN)).coeff(mN).multiply(13))
      .subtract(RING.multiply(RING.pow(t4, 8, mN), RING.subtract(RING.pow(t3x2, 3, mN), RING.pow(t4x2, 3, mN))).coeff(mN).divide2());
  }
}
