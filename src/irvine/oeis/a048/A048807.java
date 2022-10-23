package irvine.oeis.a048;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A048807 Matrix square of A048804.
 * @author Sean A. Irvine
 */
public class A048807 extends Sequence0 {

  private final Sequence mSeq;
  private final DefaultMatrix<Q> mA = new DefaultMatrix<>(0, 0, Q.ZERO);
  protected Matrix<Q> mA2 = null;
  protected int mN = 0;
  private int mM = 0;

  protected A048807(final Sequence seq) {
    mSeq = seq;
  }

  /** Construct the sequence. */
  public A048807() {
    this(new A048804());
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      mA.setRows(++mN);
      mA.setCols(mN);
      for (int k = 0; k < mN; ++k) {
        mA.set(mN - 1, k, new Q(mSeq.next()));
      }
      mA2 = new MatrixField<>(mN, Rationals.SINGLETON).multiply(mA, mA);
      mM = 0;
    }
    return mA2.get(mN - 1, mM).toZ();
  }
}
