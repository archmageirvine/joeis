package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.QPolynomialRingField;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005871 Theta series of hexagonal close-packing with respect to edge within layer.
 * @author Sean A. Irvine
 */
public class A005871 implements Sequence {

  private static final QPolynomialRingField<Z> RING = new QPolynomialRingField<>(IntegerField.SINGLETON);
  private static final Q SIX = Q.SIX;
  private static final Q THREE_HALVES = new Q(3, 2);
  private static final Q ONE_SIXTH = new Q(1, 6);
  private static final Q SIXTEEN_THIRDS = new Q(16, 3);

  private Q mN = ONE_SIXTH.negate();

  @Override
  public Z next() {
    mN = mN.add(ONE_SIXTH);
    final QPolynomial<Z> psi3 = ThetaFunctions.psi(Q.THREE, mN);
    final QPolynomial<Z> theta2 = ThetaFunctions.theta2(mN.multiply(Q.TWO));
    final QPolynomial<Z> a = RING.multiply(theta2.substitutePower(2), psi3.substitutePower(6), mN);

    final QPolynomial<Z> psi6 = ThetaFunctions.psi(SIX, mN);
    final QPolynomial<Z> theta3 = ThetaFunctions.theta3(mN);
    final QPolynomial<Z> b = RING.multiply(theta3.substitutePower(2), psi6.substitutePower(6), mN);

    final QPolynomial<Z> c = RING.add(a, b);
    final QPolynomial<Z> d = RING.multiply(theta2.substitutePower(SIXTEEN_THIRDS), c, mN);

    final QPolynomial<Z> e = RING.multiply(theta2.substitutePower(Q.HALF), theta2.substitutePower(THREE_HALVES), mN);
    final QPolynomial<Z> f = RING.divide(RING.multiply(e, theta3.substitutePower(SIXTEEN_THIRDS), mN), Z.TWO);
    final QPolynomial<Z> g = RING.add(d, f);

    return g.coeff(mN);
  }
}
