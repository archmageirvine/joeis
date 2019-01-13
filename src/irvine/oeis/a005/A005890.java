package irvine.oeis.a005;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005890.
 * @author Sean A. Irvine
 */
public class A005890 implements Sequence {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private static final Q TWO_NINTHS = new Q(2, 9);
  private static final Q SIXTEEN_THIRDS = new Q(16, 3);
  private static final Q EIGHTEEN_SEVENTHS = new Q(18, 7);
  private static final Q NINE_FIFTHS = new Q(9, 5);
  private static final Q SIX = new Q(6);
  private static final Q NINE = new Q(9);
  private static final Q Q18 = new Q(18);

  private Q mN = TWO_NINTHS.negate();

  @Override
  public Z next() {
    mN = mN.add(TWO_NINTHS);
    final QPolynomial<Z> theta2 = ThetaFunctions.theta2(mN);
    final QPolynomial<Z> theta3 = ThetaFunctions.theta3(mN);
    final QPolynomial<Z> psi3 = ThetaFunctions.psi(Q.THREE, mN);
    final QPolynomial<Z> psi6 = ThetaFunctions.psi(SIX, mN);
    final QPolynomial<Z> psi9 = ThetaFunctions.psi(NINE, mN);
    final QPolynomial<Z> psi18 = ThetaFunctions.psi(Q18, mN);
    final QPolynomial<Z> psi18d7 = ThetaFunctions.psi(EIGHTEEN_SEVENTHS, mN);
    final QPolynomial<Z> psi9d5 = ThetaFunctions.psi(NINE_FIFTHS, mN);

    final QPolynomial<Z> a = RING.multiply(theta2.substitutePower(2), psi18d7.substitutePower(6), mN);
    final QPolynomial<Z> b = RING.multiply(theta3.substitutePower(2), psi9.substitutePower(6), mN);
    final QPolynomial<Z> c = RING.add(a, b);
    final QPolynomial<Z> d = RING.multiply(psi3.substitutePower(SIXTEEN_THIRDS), c, mN);

    final QPolynomial<Z> e = RING.multiply(theta2.substitutePower(2), psi18.substitutePower(6), mN);
    final QPolynomial<Z> f = RING.multiply(theta3.substitutePower(2), psi9d5.substitutePower(6), mN);
    final QPolynomial<Z> g = RING.add(e, f);
    final QPolynomial<Z> h = RING.multiply(psi6.substitutePower(SIXTEEN_THIRDS), g, mN);

    final QPolynomial<Z> i = RING.add(d, h);
    return i.coeff(mN);
  }
}
