package irvine.oeis.a342;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * A342984 Triangle read by rows: T(n,k) is the number of nonseparable tree-rooted planar maps with n edges and k faces, n &gt;= 0, k = 1..n+1.
 * @author Sean A. Irvine
 */
public class A342984 extends A342982 {

  // After Andrew Howroyd

  protected static final PolynomialRingField<Z> YRING = new PolynomialRingField<>("y", IntegerField.SINGLETON);
  protected static final PolynomialRingField<Polynomial<Z>> XRING = new PolynomialRingField<>("x", YRING);
  private int mN = -1;
  private int mM = 0;
  private Polynomial<Z> mRow = YRING.zero();

  private Polynomial<Polynomial<Z>> f(final int n) {
    final Polynomial<Polynomial<Z>> f = XRING.empty();
    for (int k = 0; k <= n; ++k) {
      final Polynomial<Z> row = YRING.empty();
      for (int j = 0; j <= k; ++j) {
        row.add(t(k, j));
      }
      f.add(row);
    }
    return f;
  }

  protected Polynomial<Polynomial<Z>> g(final int n) {
    final Polynomial<Polynomial<Z>> f = f(n);
    final Polynomial<Polynomial<Z>> p2r = XRING.reversion(XRING.pow(f, 2, n).shift(1), n + 1);
    return XRING.substitute(f, p2r, n);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mRow = g(mN).coeff(mN);
    }
    return mRow.coeff(mM);
  }
}
