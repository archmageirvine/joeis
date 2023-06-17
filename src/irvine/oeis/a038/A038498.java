package irvine.oeis.a038;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008284;

/**
 * A038498 Matrix inverse of partition triangle A008284.
 * @author Sean A. Irvine
 */
public class A038498 extends AbstractSequence {

  private final DefaultMatrix<Q> mA = new DefaultMatrix<>(0, 0, Q.ZERO);
  private final Sequence mSeq;
  private Matrix<Q> mAInverse = null;
  private int mN = 0;
  private int mM = 0;

  protected A038498(final Sequence triangle) {
    super(1);
    mSeq = triangle;
  }

  /** Construct the sequence. */
  public A038498() {
    this(new A008284());
  }

  protected int exponent() {
    return 1;
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      mA.setRows(++mN);
      mA.setCols(mN);
      for (int k = 0; k < mN; ++k) {
        mA.set(mN - 1, k, new Q(mSeq.next()));
      }
      final MatrixField<Q> field = new MatrixField<>(mN, Rationals.SINGLETON);
      mAInverse = field.pow(field.inverse(mA), exponent());
      mM = 0;
    }
    return mAInverse.get(mN - 1, mM).toZ();
  }
}
