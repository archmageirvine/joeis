package irvine.oeis.a343;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a342.A342989;

/**
 * A343092 Triangle read by rows: T(n,k) is the number of rooted toroidal maps with n edges and k faces and without isthmuses, n &gt;= 2, k = 1..n-1.
 * @author Sean A. Irvine
 */
public class A343092 extends A342989 {

  // After Andrew Howroyd

  private int mN = 1;
  private int mM = 1;
  private Polynomial<Q> mRow = RING.zero();

  protected Polynomial<Q> h(final int n, final int g) {
    final Polynomial<Polynomial<Polynomial<Q>>> q = XRING.subtract(g(n, 1), XRING.x());
    final Polynomial<Polynomial<Polynomial<Q>>> t = XRING.series(XRING.x(), XRING.pow(q, 2, n + 1), n + 1);
    final Polynomial<Polynomial<Polynomial<Q>>> rev = XRING.reversion(t, n + 1).shift(-1);
    final Polynomial<Polynomial<Polynomial<Q>>> sqrt = XRING.sqrt(rev, n + 1);
    return sqrt.coeff(n).coeff(g);
  }

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      mM = 0;
      mRow = h(++mN, 1);
    }
    return mRow.coeff(mM).toZ();
  }
}
