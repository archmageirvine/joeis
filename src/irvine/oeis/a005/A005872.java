package irvine.oeis.a005;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005872 Theta series of hexagonal close-packing with respect to octahedral hole.
 * @author Sean A. Irvine
 */
public class A005872 implements Sequence {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private static final Q SIX = Q.SIX;
  private static final Q FOUR_THIRDS = new Q(4, 3);

  private Q mN = Q.ONE_THIRD.negate();

  @Override
  public Z next() {
    mN = mN.add(Q.ONE_THIRD);
    final QPolynomial<Z> psi3 = ThetaFunctions.psi(Q.THREE, mN);
    final QPolynomial<Z> theta3 = ThetaFunctions.theta3(mN);
    final QPolynomial<Z> a = RING.multiply(theta3.substitutePower(2), psi3.substitutePower(6), mN);

    final QPolynomial<Z> psi6 = ThetaFunctions.psi(SIX, mN);
    final QPolynomial<Z> theta2 = ThetaFunctions.theta2(mN);
    final QPolynomial<Z> b = RING.multiply(theta2.substitutePower(2), psi6.substitutePower(6), mN);

    final QPolynomial<Z> c = RING.add(a, b);
    final QPolynomial<Z> d = RING.multiply(c, theta2.substitutePower(FOUR_THIRDS), mN);

    return d.coeff(mN);
  }
}
