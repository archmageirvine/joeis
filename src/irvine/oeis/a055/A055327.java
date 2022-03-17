package irvine.oeis.a055;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055327 Triangle of rooted identity trees with n nodes and k leaves.
 * @author Sean A. Irvine
 */
public class A055327 implements Sequence {

  private static final PolynomialRingField<Q> RING_Y = new PolynomialRingField<>("y", Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(RING_Y);
  private static final Polynomial<Polynomial<Q>> Y = RING.monomial(RING_Y.x(), 0);
  private Polynomial<Polynomial<Q>> mGf = Y;
  private int mN = 0;
  private int mM = 0;

  private Polynomial<Polynomial<Q>> weighTransform(final Polynomial<Polynomial<Q>> u) {
    final int n = u.size();
    final Polynomial<Polynomial<Q>> p = u.shift(1);

    Polynomial<Polynomial<Q>> sum = RING.zero();
    for (int k = 1; k <= n; ++k) {
      final Polynomial<Polynomial<Q>> v = RING.divide(PolynomialUtils.innerSubstitute(RING, p.substitutePower(k, n), k, n), RING_Y.monomial(new Q(k), 0));
      sum = RING.signedAdd((k & 1) == 1, sum, v);
    }
    sum = RING.exp(sum, n);
    return RING.subtract(sum, RING.one());
  }

  protected void step() {
    mGf = RING.add(Y, weighTransform(mGf));
  }

  @Override
  public Z next() {
    if (++mM > mGf.coeff(mN).degree()) {
      ++mN;
      mM = 1;
      step();
    }
    return mGf.coeff(mN).coeff(mM).toZ();
  }
}
