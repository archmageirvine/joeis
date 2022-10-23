package irvine.oeis.a005;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005929 Theta series of hexagonal net with respect to midpoint of edge.
 * @author Sean A. Irvine
 */
public class A005929 extends Sequence0 {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private static final Q THREE_QUARTERS = new Q(3, 4);

  private Q mN = Q.ONE_QUARTER.negate();

  private QPolynomial<Z> phi1times2(final Q n) {
    final QPolynomial<Z> theta2 = ThetaFunctions.theta2(n.multiply(4));
    return RING.multiply(theta2.substitutePower(Q.ONE_QUARTER), theta2.substitutePower(THREE_QUARTERS), mN);
  }

  @Override
  public Z next() {
    mN = mN.add(Q.ONE_QUARTER);
    final QPolynomial<Z> phi1 = phi1times2(mN);
    return RING.subtract(phi1, phi1.substitutePower(3)).coeff(mN).divide2();
  }
}
