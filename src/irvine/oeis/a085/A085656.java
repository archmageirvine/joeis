package irvine.oeis.a085;

import irvine.math.api.Matrix;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085656 Number of positive-definite real {0,1} n X n matrices.
 * @author Sean A. Irvine
 */
public class A085656 extends Sequence1 {

  // After Max Alekseyev

  private int mN;
  private long mCount;
  private int[][] mM;
  private MatrixRing<Z> mRing = null;

  private boolean positive(final int k) {
    final Matrix<Z> mat = new DefaultMatrix<>(k, k, Z.ZERO);
    for (int i = 0; i < k; ++i) {
      for (int j = 0; j < k; ++j) {
        mat.set(i, j, Z.valueOf(mM[i][j]));
      }
    }
    return mRing.det(mat).signum() > 0;
  }

  private void search(final int k) {
    if (k == mN) {
      int t = 0;
      for (int i = 1; i < mN; ++i) {
        for (int j = 0; j < i; ++j) {
          if (mM[i][j] == 1) {
            ++t;
          }
        }
      }
      mCount += 1L << t;
      return;
    }

    final int bits = 1 << k;
    for (int mask = 0; mask < bits; ++mask) {
      for (int j = 0; j < k; ++j) {
        final int v = (mask >> j) & 1;
        mM[k][j] = v;
        mM[j][k] = v;
      }
      if (positive(k + 1)) {
        search(k + 1);
      }
    }
  }

  @Override
  public Z next() {
    mRing = new MatrixField<>(++mN, IntegerField.SINGLETON);
    mCount = 0;
    mM = new int[mN][mN];
    for (int k = 0; k < mN; ++k) {
      mM[k][k] = 2;
    }
    search(0);
    return Z.valueOf(mCount);
  }
}
