package irvine.oeis.a155;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A381103.
 * @author Sean A. Irvine
 */
public class A155033 extends Sequence1 {

  private Matrix<Q> mMatrix = null;
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      final Sequence s = new A155031();
      mMatrix = new DefaultMatrix<>(mN, mN, Q.ZERO);
      for (int r = 0; r < mN; ++r) {
        for (int c = 0; c <= r; ++c) {
          mMatrix.set(r, c, Q.valueOf(s.next()));
        }
      }
      mMatrix = new MatrixField<>(mN, Rationals.SINGLETON).inverse(mMatrix);
    }
    return mMatrix.get(mN - 1, mM).toZ();
  }
}
