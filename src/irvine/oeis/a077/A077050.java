package irvine.oeis.a077;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077048.
 * @author Sean A. Irvine
 */
public class A077050 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private Matrix<Q> mMat;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      final MatrixField<Q> ring = new MatrixField<>(mN, Rationals.SINGLETON);
      mMat = new DefaultMatrix<>(mN, mN, Q.ZERO);
      for (int r = 0; r < mN; ++r) {
        for (int c = 0; c < mN; ++c) {
          if ((r + 1) % (c + 1) == 0) {
            mMat.set(r, c, Q.ONE);
          }
        }
      }
      mMat = ring.inverse(mMat);
    }
    return mMat.get(mN - mM - 1, mM).toZ();
  }
}

