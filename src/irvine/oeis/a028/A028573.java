package irvine.oeis.a028;

import irvine.math.group.IntegerField;
import irvine.math.group.QPolynomialRingField;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028573 Expansion of theta_3(z)*theta_3(4z)+theta_2(z)*theta_2(4z).
 * @author Sean A. Irvine
 */
public class A028573 implements Sequence {

  private static final QPolynomialRingField<Z> RING = new QPolynomialRingField<>(IntegerField.SINGLETON);
  private Q mN = Q.ONE_QUARTER.negate();

  protected int power() {
    return 1;
  }

  @Override
  public Z next() {
    mN = mN.add(Q.ONE_QUARTER);
    final Q t = mN.divide(4);
    final QPolynomial<Z> a = RING.multiply(ThetaFunctions.theta3(mN), ThetaFunctions.theta3(t).substitutePower(4), mN);
    final QPolynomial<Z> b = RING.multiply(ThetaFunctions.theta2(mN), ThetaFunctions.theta2(t).substitutePower(4), mN);
    return RING.pow(RING.add(a, b), power(), mN).coeff(mN);
  }
}
