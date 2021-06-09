package irvine.oeis.a342;

import irvine.math.api.Matrix;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A342989.
 * @author Sean A. Irvine
 */
public class A342989 implements Sequence {

  // After Andrew Howroyd

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>("z", IntegerField.SINGLETON);
  private static final PolynomialRingField<Polynomial<Z>> YRING = new PolynomialRingField<>("y", RING);
  protected static final PolynomialRingField<Polynomial<Polynomial<Z>>> XRING = new PolynomialRingField<>("x", YRING);
  private int mN = 1;
  private int mM = 1;
  private Polynomial<Z> mRow = RING.zero();

  private Matrix<Polynomial<Z>> mq(final long n, final long g, final Polynomial<Z> x) {
    final Polynomial<Z> xp1 = RING.add(RING.one(), x);
    final Matrix<Polynomial<Z>> q = new DefaultMatrix<>(n + 1, g + 1, RING.zero());
    q.set(0, 0, x);
    for (int row = 1; row <= n; ++row) {
      for (int col = 0; col <= Math.min(row / 2, g); ++col) {
        Polynomial<Z> t = RING.multiply(RING.multiply(q.get(row - 1, col), xp1), Z.valueOf(2 * (2 * row - 1)));
        if (col > 0 && row > 1) {
          t = RING.add(t, RING.multiply(q.get(row - 2, col - 1), Z.valueOf(2 * row - 3).multiply(row - 1).multiply(2 * row - 1)));
        }
        for (long k = 1; k < row; ++k) {
          for (long j = 0; j <= col; ++j) {
            t = RING.add(t, RING.multiply(RING.multiply(q.get(k - 1, j), q.get(row - k - 1, col - j)), Z.valueOf(2 * k - 1).multiply(2 * (row - k) - 1).multiply(3)));
          }
        }
        q.set(row, col, RING.divide(t, Z.valueOf(row + 1)));
      }
    }
    return q;
  }

  protected Polynomial<Polynomial<Polynomial<Z>>> f(final long n, final long m) {
    final Matrix<Polynomial<Z>> q = mq(n, m, RING.x());
    Polynomial<Polynomial<Polynomial<Z>>> f = XRING.empty();
    for (int row = 0; row < q.rows(); ++row) {
      final Polynomial<Polynomial<Z>> ser = YRING.empty();
      for (int col = 0; col < q.cols(); ++col) {
        ser.add(q.get(row, col).shift(-1));
      }
      f.add(ser);
    }
    return f;
  }

  protected Polynomial<Polynomial<Polynomial<Z>>> g(final long n, final long m) {
    final Polynomial<Polynomial<Polynomial<Z>>> p = f(n, m);
    final Polynomial<Polynomial<Polynomial<Z>>> p2r = XRING.reversion(XRING.pow(p, 2, mN).shift(1), mN + 1);
    return XRING.substitute(p, p2r, mN);
  }

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      ++mN;
      mM = 0;
      mRow = g(mN, 1).coeff(mN).coeff(1);
    }
    return mRow.coeff(mM);
  }
}
