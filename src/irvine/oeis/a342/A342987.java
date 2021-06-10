package irvine.oeis.a342;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A342987 Triangle read by rows: T(n,k) is the number of tree-rooted planar maps with n edges, k faces and no isthmuses, n &gt;= 0, k = 1..n+1.
 * @author Sean A. Irvine
 */
public class A342987 extends A342984 {

  // After Andrew Howroyd

  private int mN = -1;
  private int mM = 0;
  private Polynomial<Z> mRow = YRING.zero();

  protected Polynomial<Z> h(final int n) {
    final Polynomial<Polynomial<Z>> q = XRING.subtract(g(n), XRING.x());
    final Polynomial<Polynomial<Z>> t = XRING.series(XRING.x(), XRING.pow(q, 2, n + 1), n + 1);
    final Polynomial<Polynomial<Z>> rev = XRING.reversion(t, n + 1).shift(-1);
    final Polynomial<Polynomial<Z>> sqrt = XRING.sqrt(rev, n + 1);
    return sqrt.coeff(n);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mRow = h(mN);
    }
    return mRow.coeff(mM);
  }
}
