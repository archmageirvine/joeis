package irvine.oeis.a023;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023919 Theta series of <code>A*_7</code> lattice. Expansion of <code>F_8(q^2)</code>.
 * @author Sean A. Irvine
 */
public class A023919 implements Sequence {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private static final Z Z14 = Z.valueOf(14);
  private int mN = -1;

  static QPolynomial<Z> psi(final int n) {
    final QPolynomial<Z> p = QPolynomial.create();
    for (int k = 0; k * k + 1 <= 2 * n; ++k) {
      p.put(new Q(k * (k + 1), 2), Z.ONE);
    }
    return p;
  }

  @Override
  public Z next() {
    final QPolynomial<Z> phi = ThetaFunctions.theta3(++mN);
    final QPolynomial<Z> psi = psi(mN);
    final QPolynomial<Z> phi2 = phi.substitutePower(2);
    final QPolynomial<Z> f88 = RING.subtract(RING.add(RING.add(RING.pow(phi2, 7, mN),
      RING.pow(RING.multiply(psi.substitutePower(4), RING.monomial(Z.TWO, Q.HALF)), 7, mN)),
      RING.multiply(RING.multiply(RING.pow(phi2, 5, mN), RING.pow(phi, 2, mN), mN), Z14)),
      RING.multiply(RING.multiply(RING.pow(phi2, 3, mN), RING.pow(phi, 4, mN), mN), Z.SEVEN));
    return f88.substitutePower(2).coeff(mN).divide(8);
  }
}
