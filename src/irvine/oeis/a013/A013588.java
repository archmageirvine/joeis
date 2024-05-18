package irvine.oeis.a013;

import java.util.HashSet;
import java.util.Set;

import irvine.math.LongUtils;
import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013588 Smallest positive integer not the determinant of an n X n {0,1}-matrix.
 * @author Sean A. Irvine
 */
public class A013588 extends Sequence1 {

  private int mN = 0;
  private MatrixField<Q> mRing;
  private final Set<Long> mDeterminants = new HashSet<>();
  private Matrix<Q> mMatrix;

  private void search(final int row, final long max) {
    if (row >= mN) {
      final Q det = mRing.det(mMatrix);
      if (det.isInteger()) {
        mDeterminants.add(Math.abs(det.toZ().longValueExact()));
      }
      return;
    }
    for (long vec = 0; vec < max; ++vec) {
      long t = vec;
      for (int col = 0; col < mN; ++col) {
        mMatrix.set(row, col, (t & 1) == 0 ? Q.ZERO : Q.ONE);
        t >>>= 1;
      }
      search(row + 1, vec);
    }
  }

  @Override
  public Z next() {
    mRing = new MatrixField<>(++mN, Rationals.SINGLETON);
    mDeterminants.clear();
    mMatrix = new DefaultMatrix<>(mN, mN, Q.ZERO);
    search(0, 1L << mN);
    return Z.valueOf(LongUtils.mex(mDeterminants));
  }
}

