package irvine.oeis.a027;

import irvine.math.api.Matrix;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A027477 Triangle of the square of the normalized, unsigned Stirling matrix of the first kind.
 * @author Sean A. Irvine
 */
public class A027477 extends AbstractSequence {

  /** Construct the sequence. */
  public A027477() {
    super(1);
  }

  private int mN = 0;
  private int mM = 0;
  protected final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  protected Matrix<Q> mMatrix = null;

  protected int power() {
    return 2;
  }

  protected void step() {
    final MatrixField<Q> field = new MatrixField<>(++mN, Rationals.SINGLETON);
    final Matrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j <= k; ++j) {
        m.set(k, j, new Q(Stirling.firstKind(k + 1, j + 1).abs(), mF.factorial(k + 1)));
      }
    }
    mMatrix = field.pow(m, power());
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      mM = 0;
      step();
    }
    final Z f = mF.factorial(mN).pow(power());
    return mMatrix.get(mN - 1, mM).multiply(f).toZ();
  }
}
