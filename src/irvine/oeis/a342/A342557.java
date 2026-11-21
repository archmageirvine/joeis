package irvine.oeis.a342;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.a369.A369932;

/**
 * A342557 T(n,m) is the number of unlabeled connected graphs without endpoints on m nodes with n edges, where T(n,m), m &lt;= n, is a triangle read by rows.
 * @author Gregory Morse
 */
public class A342557 extends A369932 {
  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final PolynomialRingField<Polynomial<Q>> mOuter = new PolynomialRingField<>(RING);
  private Polynomial<Polynomial<Q>> mCounts = mOuter.zero();
  private int mN = -1;

  @Override
  protected Polynomial<Q> graphCounts(final int n) {
    if (n > mN) {
      final Polynomial<Polynomial<Q>> all = mOuter.empty();
      for (int k = 0; k <= n; ++k) {
        all.add(super.graphCounts(k));
      }
      mCounts = PolynomialUtils.inverseEuler(RING, all);
      mN = n;
    }
    return mCounts.coeff(n);
  }
}
