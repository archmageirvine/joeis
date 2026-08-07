package irvine.oeis.a086;

import java.util.Arrays;

import irvine.math.api.Matrix;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A086215 Number of (-1,0,1) n X n matrices M that are positive definite.
 * @author Sean A. Irvine
 */
public class A086215 extends Sequence1 {

  private final Bumper mBumper = BumperFactory.range(-1, 1);
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
      long v = 1;
      for (int i = 1; i < mN; ++i) {
        for (int j = 0; j < i; ++j) {
          switch (mM[i][j]) {
            case 0:
              v *= 3;
              break;
            case -1:
            case 1:
              v <<= 1;
              break;
            default:
              throw new RuntimeException();
          }
        }
      }
      mCount += v;
      return;
    }

    final int[] x = new int[k];
    Arrays.fill(x, -1);
    do {
      for (int j = 0; j < k; ++j) {
        mM[k][j] = x[j];
        mM[j][k] = x[j];
      }
      if (positive(k + 1)) {
        search(k + 1);
      }
    } while (mBumper.bump(x));
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
