package irvine.oeis.a054;

import irvine.math.Mobius;
import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a052.A052283;

/**
 * A054733 Triangle of number of (weakly) connected unlabeled digraphs with n nodes and k arcs (n &gt;=2, k &gt;= 1).
 * @author Sean A. Irvine
 */
public class A054733 extends A052283 {

  private final Polynomial<Polynomial<Q>> mP = new PolynomialRingField<>(new PolynomialRingField<>(Rationals.SINGLETON)).empty();
  private Polynomial<Z> mRow = RING.zero();
  {
    mP.add(PolynomialUtils.zToQ(RING.one()));
    ++mK;
    ++mK;
  }

  /**
   * Inverse Euler transform.
   * @param p bivariate polynomial
   * @param n maximum degree
   * @param m maximum inner degree
   * @return inverse Euler transform
   */
  public static Polynomial<Polynomial<Q>> inverseEuler(final Polynomial<Polynomial<Q>> p, final int n, final int m) {
    final PolynomialRingField<Polynomial<Q>> r = new PolynomialRingField<>(new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, m));
    final Polynomial<Polynomial<Q>> q = r.log(p, n); // This is where Q is needed
    return r.sum(1, n, i -> r.divide(r.multiply(PolynomialUtils.innerSubstitute(r, q.substitutePower(i, n), i, m), Polynomial.create(new Q(Mobius.mobius(i)))), Polynomial.create(new Q(i))));
  }

  protected Polynomial<Z> getRow(final int n) {
    while (mP.size() <= n) {
      mP.add(PolynomialUtils.zToQ(g(mP.size())));
    }
    return PolynomialUtils.qToZ(inverseEuler(mP, n, n * (n - 1)).coeff(n).shift(-1));
  }

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      if (++mK <= 1) {
        return Z.ONE;
      }
      mRow = getRow(mK);
      mM = 0;
    }
    return mRow.coeff(mM);
  }
}
