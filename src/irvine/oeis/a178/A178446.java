package irvine.oeis.a178;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A178446 Number of perfect matchings in the Triangle Graph of order n, reduced by the spire vertex if n mod 4 equals 1 or 2.
 * @author Sean A. Irvine
 */
public class A178446 implements Sequence {

  // After Alois P. Heinz

  private int mN = -1;

  private void skewSet(final Matrix<Q> m, final int row, final int col, final Q v) {
    m.set(row, col, v);
    m.set(col, row, v.negate());
  }

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    // Do the calculation over rationals because my det function is must faster
    // for a field than for a general ring.
    final int s = (mN & 3) == 1 || (mN & 3) == 2 ? 1 : 0;
    final int dim = (mN + 1) * mN / 2 - s;
    final Matrix<Q> m = new DefaultMatrix<>(dim, dim, Q.ZERO);
    if (s == 1) {
      skewSet(m, 0, 1, Q.ONE);
    }
    for (int j = 1 + s; j < mN; ++j) {
      int h0 = j * (j - 1) / 2 - s;
      int h1 = h0 + j;
      Q t = Q.ONE;
      for (int i = 1; i <= j; ++i) {
        skewSet(m, h1, h1 + 1, Q.ONE);
        skewSet(m, h1, h0, t);
        ++h1;
        skewSet(m, h1, h0, t);
        ++h0;
        t = t.negate();
      }
    }
    return new MatrixField<>(dim, Rationals.SINGLETON).det(m).toZ().sqrt();
  }
}
