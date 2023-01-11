package irvine.oeis.a006;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A006948 Number of zero-entropy permutations of length n.
 * @author Sean A. Irvine
 */
public class A006948 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    long count = 0;
    final MatrixRing<Z> ring = new MatrixRing<>(mN, Integers.SINGLETON);
    final Permutation perm = new Permutation(++mN);
    int[] pi;
    while ((pi = perm.next()) != null) {
      final DefaultMatrix<Z> matrix = new DefaultMatrix<>(mN - 1, mN - 1, Z.ZERO);
      for (int i = 0; i < pi.length - 1; ++i) {
        for (int j = 0; j < pi.length - 1; ++j) {
          if (pi[i] <= j && j + 1 <= pi[i + 1] || pi[i + 1] <= j && j + 1 <= pi[i]) {
            matrix.set(i, j, Z.ONE);
          }
        }
      }
      Matrix<Z> m = matrix;
      boolean ok = true;
      for (int k = 0; ok && k < 2 * pi.length - 3; ++k) {
        for (int i = 0; i < m.rows(); ++i) {
          if (Z.ONE.compareTo(m.get(i, i)) < 0) {
            ok = false;
            break;
          }
          m = ring.multiply(m, matrix);
        }
      }
      if (ok) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
