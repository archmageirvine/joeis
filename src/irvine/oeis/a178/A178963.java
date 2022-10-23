package irvine.oeis.a178;

import java.util.ArrayList;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A178963 E.g.f.: (3+2*sqrt(3)*exp(x/2)*sin(sqrt(3)*x/2))/(exp(-x)+2*exp(x/2)*cos(sqrt(3)*x/2)).
 * @author Sean A. Irvine
 */
public class A178963 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> X_HALF = RING.monomial(Q.HALF, 1);
  private static final Polynomial<Q> PTHREE = RING.monomial(Q.THREE, 0);
  private static final Polynomial<Q> NEG_X = RING.negate(RING.x());
  private Z mF = Z.ONE;
  private int mN = -1;

  private Polynomial<Q> num(final int n) {
    // 3+2*sqrt(3)*exp(x/2)*sin(sqrt(3)*x/2)
    final Polynomial<Q> sin = RING.sin(X_HALF, n);
    // Adjust coefficients for 2*sqrt(3)
    final ArrayList<Q> sinAdjust = new ArrayList<>();
    for (int k = 0; k <= sin.degree(); ++k) {
      final Q c = sin.get(k);
      sinAdjust.add(c.equals(Q.ZERO) ? c : c.multiply(Q.THREE.pow(k / 2 + 1).multiply(2)));
    }
    return RING.add(PTHREE, RING.multiply(RING.create(sinAdjust), RING.exp(X_HALF, n), n));
  }

  private Polynomial<Q> den(final int n) {
    // exp(-x)+2*exp(x/2)*cos(sqrt(3)*x/2)
    final Polynomial<Q> cos = RING.cos(X_HALF, n);
    // Adjust coefficients for 2 and sqrt(3)
    final ArrayList<Q> cosAdjust = new ArrayList<>();
    for (int k = 0; k <= cos.degree(); ++k) {
      final Q c = cos.get(k);
      cosAdjust.add(c.equals(Q.ZERO) ? c : c.multiply(Q.THREE.pow(k / 2).multiply(2)));
    }
    return RING.add(RING.exp(NEG_X, n), RING.multiply(RING.create(cosAdjust), RING.exp(X_HALF, n), n));
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.coeff(num(mN), den(mN), mN).multiply(mF).toZ();
  }
}
