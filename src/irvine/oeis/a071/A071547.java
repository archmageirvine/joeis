package irvine.oeis.a071;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence1;

/**
 * A071531.
 * @author Sean A. Irvine
 */
public class A071547 extends Sequence1 {

  private final DirectSequence mSeq = DirectSequence.create(new PrependSequence(new A071090(), 0));
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Matrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j < mN; ++j) {
        m.set(k, j, Q.valueOf(mSeq.a(Math.abs(k - j))));
      }
    }
    return new MatrixField<>(mN, Rationals.SINGLETON).det(m).toZ();
  }
}
