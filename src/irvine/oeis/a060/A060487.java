package irvine.oeis.a060;

import irvine.math.group.DegreeLimitedPolynomialRingField;
import irvine.math.group.PolynomialRingField;
import irvine.math.partitions.IntegerPartition;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a188.A188445;

/**
 * A060487 Triangle T(n,k) of k-block tricoverings of an n-set (n &gt;= 3, k &gt;= 4).
 * @author Sean A. Irvine
 */
public class A060487 extends A188445 {

  // After Andrew Howroyd

  private int mN = 2;
  private int mM = 0;
  private Polynomial<Q> mRow = RING.zero();

  private Polynomial<Q> row(final int n, final int k) {
    if (n == 0) {
      return RING.one();
    }
    final int m = n * k + 1;
    final DegreeLimitedPolynomialRingField<Q> inner = new DegreeLimitedPolynomialRingField<>("y", Rationals.SINGLETON, m);
    final PolynomialRingField<Polynomial<Q>> ring = new PolynomialRingField<>("x", inner);
    final Polynomial<Q> exp = inner.exp(inner.integrate(inner.negate(inner.series(inner.monomial(Q.ONE, n), CMX, m - 1))), m);
    final Polynomial<Polynomial<Q>> lift = PolynomialUtils.lift(exp);

    // The code by Howroyd uses f(x) / (y+x), but that does not work well for me here, because it
    // cannot be expanded as polynomial series.  So instead I do f(x) / (1/y + x), and deal with
    // the consequences of that change.

    // 1 / (1/y + x) = y - y^2*x + y^3*x^2 - y^*x^3 + ...
    final Polynomial<Polynomial<Q>> invDen = ring.empty();
    for (int j = 0; j <= m; ++j) {
      invDen.add(inner.monomial((j & 1) == 0 ? Q.ONE : Q.NEG_ONE, j + 1));
    }
    final Polynomial<Polynomial<Q>> q = ring.multiply(lift, invDen, m);
    Polynomial<Q> sum = RING.zero();
    for (int j = 0; j <= m; ++j) {
      Q s = Q.ZERO;
      final IntegerPartition part = new IntegerPartition(j);
      int[] p;
      while ((p = part.next()) != null) {
        if (isMaxPart(p, n)) {
          s = s.signedAdd((p.length & 1) == 0, d(p, n, k));
        }
      }
      sum = RING.add(sum, RING.series(RING.multiply(q.coeff(q.degree() - j), s).shift(-1 - k), RING.onePlusXToTheN(1), m));
    }
    return (m & 1) == 0 ? sum : RING.negate(sum);
  }

  @Override
  public Z next() {
    if (--mM < 0) {
      ++mN;
      mM = 0;
      mRow = row(3, mN);
      mM = mRow.degree();
    }
    return mRow.coeff(mM).toZ();
  }
}
