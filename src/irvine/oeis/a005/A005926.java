package irvine.oeis.a005;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005926.
 * @author Sean A. Irvine
 */
public class A005926 implements Sequence {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private static final Q ONE_SIXTEENTH = new Q(1, 16);
  private static final Q EIGHT_THIRDS = new Q(8, 3);
  private static final Q EIGHT = new Q(8);

  private Q mN = ONE_SIXTEENTH.negate();

  @Override
  public Z next() {
    mN = mN.add(ONE_SIXTEENTH);
    final QPolynomial<Z> theta2 = ThetaFunctions.theta2(mN.multiply(2));
    final QPolynomial<Z> theta3 = ThetaFunctions.theta3(mN);
    final QPolynomial<Z> t = RING.add(RING.multiply(theta2.substitutePower(2), ThetaFunctions.psi(EIGHT_THIRDS, mN).substitutePower(4), mN),
      RING.multiply(theta3.substitutePower(2), ThetaFunctions.psi(EIGHT, mN).substitutePower(4)));
    final QPolynomial<Z> u = RING.multiply(theta2.substitutePower(Q.HALF), t, mN);
    return u.coeff(mN);
  }
}
