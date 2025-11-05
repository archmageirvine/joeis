package irvine.oeis.a390;

import java.util.Arrays;

import irvine.math.api.Matrix;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.partition.IntegerComposition;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390149 allocated for Ludovic Schwob.
 * @author Sean A. Irvine
 */
public class A390149 extends Sequence0 {

  // After Ludovic Schwob

  private int mN = -1;

  private Z truncatedRectPaths(final int m, final int n, final int k) {
    if (m < 0 || n < 0 || k > Math.min(m, n)) {
      return Z.ZERO;
    }
    Z s = Z.ZERO;
    for (int parts = 1; parts <= k + 1; ++parts) {
      final IntegerComposition comp = new IntegerComposition(k + 1, parts);
      int[] c;
      while ((c = comp.next()) != null) {
        final int[] l1 = Arrays.copyOf(c, c.length);
        final int[] l2 = c; // No need to copy, c is already safe from comp
        --l1[0];
        l1[l1.length - 1] += m - k;
        --l2[l2.length - 1];
        l2[0] += n - k;
        s = s.signedAdd((c.length & 1) == 1, Integers.SINGLETON.product(0, l1.length - 1, j -> Binomial.binomial(l1[j] + l2[j], l1[j])));
      }
    }
    return s;
  }

  @Override
  public Z next() {
    ++mN;
    final Matrix<Z> m = new DefaultMatrix<>(mN, mN, Z.ZERO);
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j < mN; ++j) {
        m.set(k, j, truncatedRectPaths(2 * j - k + 1, 2 * k - j + 1, Math.max(0, 2 * (k + j) - 3 * (mN - 1))));
      }
    }
    return new MatrixField<>(mN, IntegerField.SINGLETON).det(m);
  }
}
