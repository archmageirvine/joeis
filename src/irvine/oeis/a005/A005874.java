package irvine.oeis.a005;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005874 Theta series of hexagonal close-packing with respect to triangle between tetrahedra.
 * @author Sean A. Irvine
 */
public class A005874 implements Sequence {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private static final Q SIX = new Q(6);
  private static final Q TWO_THIRDS = new Q(2, 3);
  private static final Q SIXTEEN_THIRDS = new Q(16, 3);

  private Q mN = TWO_THIRDS.negate();

  @Override
  public Z next() {
    mN = mN.add(TWO_THIRDS);
    final QPolynomial<Z> theta2 = ThetaFunctions.theta2(mN);
    final QPolynomial<Z> a = RING.multiply(theta2.substitutePower(2), theta2.substitutePower(6), mN);
    final QPolynomial<Z> theta3 = ThetaFunctions.theta3(mN);
    final QPolynomial<Z> b = RING.multiply(theta3.substitutePower(2), theta3.substitutePower(6), mN);
    final QPolynomial<Z> c = RING.add(a, b);
    final QPolynomial<Z> h = RING.multiply(theta2.substitutePower(SIXTEEN_THIRDS), c, mN);

    final QPolynomial<Z> psi6 = ThetaFunctions.psi(SIX, mN);
    final QPolynomial<Z> d = RING.multiply(theta2.substitutePower(2), psi6.substitutePower(6), mN);
    final QPolynomial<Z> psi3 = ThetaFunctions.psi(Q.THREE, mN);
    final QPolynomial<Z> e = RING.multiply(theta3.substitutePower(2), psi3.substitutePower(6), mN);
    final QPolynomial<Z> f = RING.add(d, e);
    final QPolynomial<Z> g = RING.multiply(theta3.substitutePower(SIXTEEN_THIRDS), f, mN);

    final QPolynomial<Z> i = RING.add(g, h);
    //System.out.println("i="+i);
    return i.coeff(mN);
  }
}
