package irvine.oeis.a394;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394646 Triangle read by rows: row n gives y transposed, where y is the solution to the matrix equation M*y=b, where the matrix M and vector b are defined by M(i,j) = ((10^(i+1) + 1)^(j-1) + 9)/10 and b(i) = ((10^(i+1)+1)^n + 9)/10 for 1 &lt;= i,j &lt;= n.
 * @author Sean A. Irvine
 */
public class A394646 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private Matrix<Q> mY = null;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      final Matrix<Q> m = new DefaultMatrix<>(mN, mN, Q.ZERO);
      for (int k = 0; k < mN; ++k) {
        for (int j = 0; j < mN; ++j) {
          m.set(k, j, Q.TEN.pow(k + 2).add(1).pow(j).add(9).divide(10));
        }
      }
      final Matrix<Q> b = new DefaultMatrix<>(mN, 1, Q.ZERO);
      for (int k = 0; k < mN; ++k) {
        b.set(k, 0, Q.TEN.pow(k + 2).add(1).pow(mN).add(9).divide(10));
      }
      final MatrixField<Q> fld = new MatrixField<>(mN, Rationals.SINGLETON);
      mY = fld.multiply(fld.inverse(m), b);
    }
    return mY.get(mM, 0).toZ();
  }
}
