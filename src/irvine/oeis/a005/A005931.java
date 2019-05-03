package irvine.oeis.a005;

import irvine.math.group.QPolynomialRing;
import irvine.math.polynomial.QPolynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005931 Theta series of the coset of the <code>E_7</code> lattice in its dual.
 * @author Sean A. Irvine
 */
public class A005931 implements Sequence {

  private static final QPolynomialRing<Z> RING = new QPolynomialRing<>(Integers.SINGLETON);
  private static final Z Z56 = Z.valueOf(56);
  private static final Z Z128 = Z.valueOf(128);
  private int mN = -1;

  private QPolynomial<Z> psi(final int n) {
    final QPolynomial<Z> psi = new QPolynomial<>("q", Z.ZERO, Z.ONE);
    int v;
    for (int k = 0; (v = k * (k + 1) / 2) <= n; ++k) {
      psi.put(new Q(v), Z.ONE);
    }
    return psi;
  }

  @Override
  public Z next() {
    ++mN;
    final QPolynomial<Z> theta3 = ThetaFunctions.theta3(mN);
    final QPolynomial<Z> psi = psi(mN);
    final QPolynomial<Z> a = RING.multiply(RING.multiply(RING.pow(psi.substitutePower(2), 3, mN), RING.pow(theta3, 4, mN)), Z56);
    final QPolynomial<Z> b = RING.multiply(RING.pow(psi.substitutePower(2), 7, mN).shift(1), Z128);
    return RING.add(a, b).coeff(mN);
  }
}
