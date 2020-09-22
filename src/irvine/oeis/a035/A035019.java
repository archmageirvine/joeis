package irvine.oeis.a035;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035019.
 * @author Sean A. Irvine
 */
public class A035019 implements Sequence {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final QPolynomial<Z> theta3 = ThetaFunctions.theta3(mN);
      final QPolynomial<Z> theta3p3 = theta3.substitutePower(3, new Q(mN));
      final QPolynomial<Z> theta2 = ThetaFunctions.theta2(mN);
      final QPolynomial<Z> theta2p3 = theta2.substitutePower(3, new Q(mN));
      final QPolynomial<Z> g = RING.add(RING.multiply(theta3, theta3p3, mN), RING.multiply(theta2, theta2p3, mN));
      final Z c = g.coeff(mN);
      if (!Z.ZERO.equals(c)) {
        return c;
      }
    }
  }
}
