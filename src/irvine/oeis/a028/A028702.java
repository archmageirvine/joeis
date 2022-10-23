package irvine.oeis.a028;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028702 Expansion of (theta_3(z)*theta_3(3z)*theta_3(9z)+theta_2(z)*theta_2(3z)*theta_2(9z)).
 * @author Sean A. Irvine
 */
public class A028702 extends Sequence0 {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private Q mN = Q.ONE_QUARTER.negate();

  protected int power() {
    return 1;
  }

  @Override
  public Z next() {
    mN = mN.add(Q.ONE_QUARTER);
    final QPolynomial<Z> theta2 = ThetaFunctions.theta2(mN);
    final QPolynomial<Z> theta3 = ThetaFunctions.theta3(mN);
    final QPolynomial<Z> a = RING.multiply(RING.multiply(theta2, theta2.substitutePower(3, mN), mN), theta2.substitutePower(9, mN), mN);
    final QPolynomial<Z> b = RING.multiply(RING.multiply(theta3, theta3.substitutePower(3, mN), mN), theta3.substitutePower(9, mN), mN);
    return RING.pow(RING.add(a, b), power(), mN).coeff(mN);
  }
}
