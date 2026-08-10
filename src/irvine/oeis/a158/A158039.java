package irvine.oeis.a158;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.matrix.IdentityMatrix;
import irvine.math.matrix.LambdaMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A158039 Determinant of power series of gamma matrix with determinant 7!.
 * @author Georg Fischer
 */
public class A158039 extends AbstractSequence {

  private int mN = 0;
  private final long mGamma;
  private final int mSign;
  private Matrix<Q> mSum;
  private Matrix<Q> mProd;
  private final LambdaMatrix<Q> mA;
  private final MatrixField<Q> mF;

  /** Construct the sequence. */
  public A158039() {
    this(1, 8, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param gamma the determinant is (gamma-1)!
   * @param sign 1 or -1 for alternating sum
   */
  public A158039(final int offset, final long gamma, final int sign) {
    super(offset);
    mN = 0;
    mGamma = gamma;
    mSign = sign;
    mA = new LambdaMatrix<>(mGamma, mGamma, Q.ZERO, (i, j) -> new Q((i == 0) ? 1 : (j % (i + 1) + 1)), 0);
    mProd = new IdentityMatrix<>(mGamma, Q.ZERO, Q.ONE);
    mSum = new DefaultMatrix<>(mGamma, mGamma, Q.ZERO);
    mF = new MatrixField<>(mGamma, Rationals.SINGLETON);
  }

  @Override
  public Z next() {
    ++mN;
    // System.out.println("mN=" + mN + ", mGamma=" + mGamma + ", mat=" + mA + ", prod=" + mProd + ", sum=" + mSum);
    mProd = mF.multiply(mProd, mA);
    if ((mN & 1) == 0 && mSign < 0) {
      mSum = mF.subtract(mSum, mProd);
    } else {
      mSum = mF.add(mSum, mProd);
    }
    return mF.det(mSum).toZ();
  }
}
