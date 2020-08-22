package irvine.oeis.a004;

import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004530 Expansion of (theta_2(0, x) + theta_3(0, x) + theta_4(0, x)) / 2 in powers of x^(1/4).
 * @author Sean A. Irvine
 */
public class A004530 implements Sequence {

  private static final Q QUARTER = Q.ONE_QUARTER;
  private Q mN = QUARTER.negate();

  @Override
  public Z next() {
    mN = mN.add(QUARTER);
    final QPolynomial<Z> theta2 = ThetaFunctions.theta2(mN);
    final QPolynomial<Z> theta3 = ThetaFunctions.theta3(mN);
    final QPolynomial<Z> theta4 = ThetaFunctions.theta4(mN);
    return theta2.coeff(mN).add(theta3.coeff(mN)).add(theta4.coeff(mN)).divide2();
  }
}
