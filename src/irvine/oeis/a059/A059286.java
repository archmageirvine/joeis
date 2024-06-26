package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059286 Triangle T(n,k) (0 &lt;= k &lt;= n) with e.g.f. exp(x*y/(1-y)).
 * @author Sean A. Irvine
 */
public class A059286 extends Sequence0 {

  private Polynomial<Polynomial<Q>> mEgf;
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, mN);
      final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>(inner);
      if (++mN == 0) {
        mEgf = ring.one();
      } else {
        final Polynomial<Q> s = inner.x();
        mEgf = ring.exp(ring.series(ring.monomial(s, 1), ring.oneMinusXToTheN(1), mN), mN);
      }
      mM = 0;
    }
    return mEgf.coeff(mM).coeff(mN - mM).multiply(Functions.FACTORIAL.z(mN - mM)).multiply(Functions.FACTORIAL.z(mM)).toZ();
  }
}
