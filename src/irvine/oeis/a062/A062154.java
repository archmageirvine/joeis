package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062154 Number T(n,m) of n X m matrices over {0,1,2} with all row and column sums equal to 1 or 2, m=0,..,2*n.
 * @author Sean A. Irvine
 */
public class A062154 extends Sequence0 {

  private static final Polynomial<Q> TWO = Polynomial.create(Q.TWO);
  protected Polynomial<Polynomial<Q>> mEgf = null;
  private int mN = -1;
  private int mM = 0;

  protected void step() {
    ++mN;
    final PolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, 2 * mN);
    final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>(inner);
    final Polynomial<Polynomial<Q>> xy = ring.monomial(inner.x(), 1);
    final Polynomial<Polynomial<Q>> isqrt = ring.series(ring.one(), ring.sqrt1m(xy, mN), mN);
    final Polynomial<Polynomial<Q>> xy2 = ring.monomial(inner.x().shift(1), 1);
    final Polynomial<Polynomial<Q>> x2y = ring.monomial(inner.x(), 2);
    final Polynomial<Polynomial<Q>> a = ring.add(xy, ring.divide(ring.add(xy2, x2y), TWO));
    final Polynomial<Polynomial<Q>> b = ring.series(a, ring.subtract(ring.one(), xy), mN);
    final Polynomial<Polynomial<Q>> exp = ring.exp(ring.add(ring.divide(xy, TWO), b), mN);
    mEgf = ring.multiply(isqrt, exp, mN);
  }

  @Override
  public Z next() {
    if (mEgf == null || ++mM > mEgf.coeff(mN).degree()) {
      step();
      mM = 0;
    }
    return mEgf.coeff(mN).coeff(mM).multiply(Functions.FACTORIAL.z(mN)).multiply(Functions.FACTORIAL.z(mM)).toZ();
  }
}
