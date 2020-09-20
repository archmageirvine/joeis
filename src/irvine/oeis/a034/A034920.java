package irvine.oeis.a034;

import java.util.HashSet;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.SmallDenseMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034920 Maximal consecutive determinant of n X n persymmetric matrix with entries {-1,0,+1}.
 * @author Sean A. Irvine
 */
public class A034920 implements Sequence {

  private static final Z[] ELEMENTS = {Z.NEG_ONE, Z.ZERO, Z.ONE};
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Z> seen = new HashSet<>();
    final Z[][] m = new Z[mN][mN];
    final Matrix<Z> mat = new SmallDenseMatrix<>(m, Z.ZERO); // does not copy m
    final MatrixRing<Z> ring = new MatrixRing<>(mN, Integers.SINGLETON);
    final long limit = Z.THREE.pow(2 * mN - 1).longValueExact();
    for (long u = 0; u < limit; ++u) {
      long t = u;
      for (int k = 0; k < 2 * mN - 1; ++k) {
        final Z e = ELEMENTS[(int) (t % 3)];
        t /= 3;
        for (int j = Math.min(k, mN - 1); j >= 0; --j) {
          if (k - j >= 0 && k - j < mN) {
            m[k - j][j] = e;
          }
        }
      }
      final Z det = ring.det(mat);
      seen.add(det);
    }
    Z res = Z.ZERO;
    while (seen.contains(res)) {
      res = res.add(1);
    }
    return res.subtract(1);
  }
}
