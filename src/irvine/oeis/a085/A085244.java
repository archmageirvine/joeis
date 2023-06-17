package irvine.oeis.a085;

import irvine.math.LongUtils;
import irvine.math.api.Matrix;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A085244 Permanent of the symmetric n X n matrix M defined by M(i,j) = gcd(i,j) for 1 &lt;= i,j &lt;= n.
 * @author Georg Fischer
 */
public class A085244 extends AbstractSequence {

  private int mN;

  /** Construct the sequence. */
  public A085244() {
    super(1);
    mN = 0;
  }

  /**
   * Fill the elements of the n x n matrix.
   * @param n dimension of the matrix
   * @param mat matrix to be filled
   */
  protected void fillMatrix(final int n, final Matrix<Z> mat) {
    for (int i = 0; i < mN; ++i) {
      for (int j = 0; j < mN; ++j) {
        mat.set(i, j, Z.valueOf(LongUtils.gcd(i + 1, j + 1)));
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    final Matrix<Z> mat = new DefaultMatrix<>(mN, mN, Z.ZERO);
    fillMatrix(mN, mat);
    return new MatrixRing<Z>(mN, IntegerField.SINGLETON).permanent(mat);
  }
}
