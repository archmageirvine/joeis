package irvine.oeis.a004;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004701 Expansion of e.g.f. 1/(4 - exp(x) - exp(2*x) - exp(3*x)).
 * @author Sean A. Irvine
 */
public class A004701 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.monomial(new Q(terms()), 0);

  private int mN = -1;
  private Z mF = Z.ONE;

  protected int terms() {
    return 4;
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    Polynomial<Q> den = mA;
    for (int k = 1; k < terms(); ++k) {
      den = RING.subtract(den, RING.exp(RING.monomial(new Q(k), 1), mN));
    }
    return RING.coeff(RING.one(), den, mN).multiply(mF).toZ();
  }
}

