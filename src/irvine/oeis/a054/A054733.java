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
 * A052283 Triangle read by rows: T(n,k) is the number of unlabeled directed graphs on n nodes with k arcs, k=0..n*(n-1).
 * @author Sean A. Irvine
 */
public class A054733 extends A052283 {

  private final Polynomial<Polynomial<Q>> mP = new PolynomialRingField<>(new PolynomialRingField<>(Rationals.SINGLETON)).empty();
  private Polynomial<Z> mRow = RING.zero();
  {
    mP.add(PolynomialUtils.zToQ(RING.one()));
    next();
    next();
  }

  private static Polynomial<Polynomial<Q>> inverseEuler(final Polynomial<Polynomial<Q>> p, final int n) {
    final int m = n * (n + 1); // limit on number of edges with n vertices
    final PolynomialRingField<Polynomial<Q>> r = new PolynomialRingField<>(new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, m));
    final Polynomial<Polynomial<Q>> q = r.log(p, n); // This is where Q is needed
    return r.sum(1, n, i -> r.divide(r.multiply(PolynomialUtils.innerSubstitute(r, q.substitutePower(i, n), i, m), Polynomial.create(new Q(Mobius.mobius(i)))), Polynomial.create(new Q(i))));
  }

  private Polynomial<Z> getRow(final int n) {
    while (mP.size() <= n) {
      mP.add(PolynomialUtils.zToQ(g(mP.size())));
    }
    return PolynomialUtils.qToZ(inverseEuler(mP, n).coeff(mN).shift(-1));
  }

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      if (++mN <= 1) {
        return Z.ONE;
      }
      mRow = getRow(mN);
      mM = 0;
    }
    return mRow.coeff(mM);
  }
}
