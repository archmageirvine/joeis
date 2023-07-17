package irvine.oeis.a027;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.BellNumbers;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A027495 Square of lower triangular normalized 2nd kind Stirling matrix.
 * @author Sean A. Irvine
 */
public class A027495 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A027495(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A027495() {
    super(1);
  }

  private int mN = 0;
  private int mM = 0;
  protected Matrix<Q> mMatrix = null;
  protected Z mLcm = null;

  protected int power() {
    return 2;
  }

  protected void step() {
    final MatrixField<Q> field = new MatrixField<>(++mN, Rationals.SINGLETON);
    final Matrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j <= k; ++j) {
        m.set(k, j, new Q(Stirling.secondKind(k + 1, j + 1), BellNumbers.bell(k + 1)));
      }
    }
    mMatrix = field.pow(m, power());
    mLcm = Z.ONE;
    for (int k = 0; k < mN; ++k) {
      mLcm = mLcm.lcm(mMatrix.get(mN - 1, k).den());
    }
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      mM = 0;
      step();
    }
    return mMatrix.get(mN - 1, mM).multiply(mLcm).toZ();
  }
}
