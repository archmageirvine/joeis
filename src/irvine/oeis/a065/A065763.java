package irvine.oeis.a065;

import irvine.math.api.Matrix;
import irvine.math.graph.Graph;
import irvine.math.graph.GraphFactory;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A065763 Number of invertible Steinhaus matrices of order n.
 * @author Sean A. Irvine
 */
public class A065763 extends Sequence2 {

  private int mN = 1;

  private Matrix<Q> toMatrix(final Graph g) {
    final Q[][] m = new Q[g.order()][g.order()];
    for (int k = 0; k < g.order(); ++k) {
      for (int j = 0; j < g.order(); ++j) {
        m[k][j] = g.isAdjacent(k, j) ? Q.ONE : Q.ZERO;
      }
    }
    return new DefaultMatrix<>(m, Q.ZERO);
  }

  @Override
  public Z next() {
    ++mN;
    final MatrixField<Q> fld = new MatrixField<>(mN, Rationals.SINGLETON);
    long count = 0;
    for (long u = 0; u < 1L << (mN - 1); ++u) {
      if (!fld.det(toMatrix(GraphFactory.steinhaus(mN, u))).equals(Q.ZERO)) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
