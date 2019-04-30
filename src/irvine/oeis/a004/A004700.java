package irvine.oeis.a004;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004700 Expansion of e.g.f. <code>1/(3 - exp(x) - exp(2*x))</code>.
 * @author Sean A. Irvine
 */
public class A004700 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> A = RING.monomial(Q.THREE, 0);
  private static final Polynomial<Q> C = RING.monomial(Q.TWO, 1);

  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> e1 = RING.exp(RING.x(), mN);
    final Polynomial<Q> e2 = RING.exp(C, mN);
    final Polynomial<Q> den = RING.subtract(RING.subtract(A, e1), e2);
    return RING.coeff(RING.one(), den, mN).multiply(mF).toZ();
  }
}

