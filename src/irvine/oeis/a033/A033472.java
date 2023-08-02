package irvine.oeis.a033;

import java.util.Arrays;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033472 Number of n-vertex labeled graphs that are gracefully labeled trees.
 * @author Sean A. Irvine
 */
public class A033472 extends Sequence1 {

  // After Noam D. Elkies

  private int mN = 0;

  private Z treedet(final int[] v) {
    final int n = v.length;
    final Matrix<Z> matrix = new DefaultMatrix<>(n, n, Z.ZERO);
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        if (i != j) {
          matrix.set(i, j, Z.valueOf(-v[Math.abs(i - j)]));
        } else {
          long sum = 0;
          for (int m = 0; m <= n; ++m) {
            if (i != m) {
              sum += v[Math.abs(i - m) % n];
            }
          }
          matrix.set(i, j, Z.valueOf(sum));
        }
      }
    }
    return new MatrixRing<>(n, Integers.SINGLETON).det(matrix);
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    final int[] v1 = new int[mN - 1];
    Arrays.fill(v1, 1);
    final int[] v0 = new int[mN - 1];
    Arrays.fill(v0, 0);
    v0[0] = 1;
    final int[] v2 = new int[mN - 1];
    for (long m = 1L << (mN - 2); m < 1L << (mN - 1); ++m) {
      long t = m;
      long sign = 0;
      for (int k = v1.length - 1; k >= 0; --k) {
        final int vk = (int) (t & 1) - v0[k];
        v2[k] = v1[k] - 2 * vk;
        sign += (long) vk * v1[k];
        t >>>= 1;
      }
      s = s.signedAdd((sign & 1) == 0, treedet(v2));
    }
    return s.shiftRight(mN - 2);
  }
}
