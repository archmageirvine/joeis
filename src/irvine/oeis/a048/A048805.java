package irvine.oeis.a048;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048805 Matrix inverse of A048804.
 * @author Sean A. Irvine
 */
public class A048805 implements Sequence {

  private final Sequence mSeq;
  private final DefaultMatrix<Q> mA = new DefaultMatrix<>(0, 0, Q.ZERO);
  protected Matrix<Q> mAInverse = null;
  protected int mN = 0;
  private int mM = 0;

  protected A048805(final Sequence seq) {
    mSeq = seq;
  }

  /** Construct the sequence. */
  public A048805() {
    this(new A048804());
  }

  protected void step() {
    mA.setRows(++mN);
    mA.setCols(mN);
    for (int k = 0; k < mN; ++k) {
      mA.set(mN - 1, k, new Q(mSeq.next()));
    }
    mAInverse = new MatrixField<>(mN, Rationals.SINGLETON).inverse(mA);
    mM = 0;
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      step();
    }
    return mAInverse.get(mN - 1, mM).toZ();
  }
}
