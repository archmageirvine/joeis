package irvine.oeis.a027;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027400 Number of labeled servers of dimension 13.
 * @author Sean A. Irvine
 */
public class A027400 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mC = c(dimension());
  private Z mF = Z.ONE;
  private int mN = -1;

  protected int dimension() {
    return 13;
  }

  private Polynomial<Q> c(final int n) {
    final Polynomial<Q> t = RING.onePlusXToTheN(1);
    Polynomial<Q> p = RING.zero();
    for (int k = 1; k <= n; ++k) {
      p = RING.add(p, RING.divide(RING.subtract(RING.pow(t, k), RING.one()), new Q(k)));
    }
    return p;
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.exp(mC, mN).coeff(mN).multiply(mF).toZ();
  }
}
