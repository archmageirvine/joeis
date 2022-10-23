package irvine.oeis.a342;

import irvine.math.api.Matrix;
import irvine.math.group.PolynomialRingField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A342989 Triangle read by rows: T(n,k) is the number of nonseparable rooted toroidal maps with n edges and k faces, n &gt;= 2, k = 1..n-1.
 * @author Sean A. Irvine
 */
public class A342989 implements Sequence {

  // After Andrew Howroyd

  // Note this done over Q because A343092 needs sqrt of these polynomials.

  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>("z", Rationals.SINGLETON);
  private static final PolynomialRingField<Polynomial<Q>> YRING = new PolynomialRingField<>("y", RING);
  protected static final PolynomialRingField<Polynomial<Polynomial<Q>>> XRING = new PolynomialRingField<>("x", YRING);
  private int mN = 1;
  private int mM = 1;
  private Polynomial<Q> mRow = RING.zero();

  private Matrix<Polynomial<Q>> mq(final int n, final int g, final Polynomial<Q> x) {
    final Polynomial<Q> xp1 = RING.add(RING.one(), x);
    final Matrix<Polynomial<Q>> q = new DefaultMatrix<>(n + 1, g + 1, RING.zero());
    q.set(0, 0, x);
    for (int row = 1; row <= n; ++row) {
      for (int col = 0; col <= Math.min(row / 2, g); ++col) {
        Polynomial<Q> t = RING.multiply(RING.multiply(q.get(row - 1, col), xp1), new Q(2 * (2L * row - 1)));
        if (col > 0 && row > 1) {
          t = RING.add(t, RING.multiply(q.get(row - 2, col - 1), new Q(2L * row - 3).multiply(row - 1).multiply(2L * row - 1)));
        }
        for (long k = 1; k < row; ++k) {
          for (long j = 0; j <= col; ++j) {
            t = RING.add(t, RING.multiply(RING.multiply(q.get(k - 1, j), q.get(row - k - 1, col - j)), new Q(2 * k - 1).multiply(2 * (row - k) - 1).multiply(3)));
          }
        }
        q.set(row, col, RING.divide(t, new Q(row + 1)));
      }
    }
    return q;
  }

  protected Polynomial<Polynomial<Polynomial<Q>>> f(final int n, final int m) {
    final Matrix<Polynomial<Q>> q = mq(n, m, RING.x());
    final Polynomial<Polynomial<Polynomial<Q>>> f = XRING.empty();
    for (int row = 0; row < q.rows(); ++row) {
      final Polynomial<Polynomial<Q>> ser = YRING.empty();
      for (int col = 0; col < q.cols(); ++col) {
        ser.add(q.get(row, col).shift(-1));
      }
      f.add(ser);
    }
    return f;
  }

  protected Polynomial<Polynomial<Polynomial<Q>>> g(final int n, final int m) {
    final Polynomial<Polynomial<Polynomial<Q>>> p = f(n, m);
    final Polynomial<Polynomial<Polynomial<Q>>> p2r = XRING.reversion(XRING.pow(p, 2, n).shift(1), n + 1);
    return XRING.substitute(p, p2r, n);
  }

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      ++mN;
      mM = 0;
      mRow = g(mN, 1).coeff(mN).coeff(1);
    }
    return mRow.coeff(mM).toZ();
  }
}
