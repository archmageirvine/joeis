package irvine.oeis.a001;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001883 Number of permutations s of {1,2,...,n} such that |s(i)-i|&gt;1 for each i=1,2,...,n.
 * @author Sean A. Irvine
 */
public class A001883 implements Sequence {

  private int mN = -1;

  private Matrix<Z> a(final int n) {
    final Matrix<Z> m = new DefaultMatrix<>(n, n, Z.ZERO);
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        if (Math.abs(i - j) > 1) {
          m.set(i, j, Z.ONE);
        }
      }
    }
    return m;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final MatrixRing<Z> ring = new MatrixRing<>(mN, Integers.SINGLETON);
    return ring.permanent(a(mN));
  }
}
