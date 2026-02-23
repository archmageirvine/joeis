package irvine.oeis.a393;

import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393479 a(n) is the permanent of the n X n symmetric matrix M(n) whose generic element M[i,j] is equal to the digit reversal of i*j.
 * @author Sean A. Irvine
 */
public class A393479 extends Sequence0 {

  private int mN = -1;

  private Z[][] matrix(final int n) {
    final Z[][] m = new Z[n][n];
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        m[i][j] = Functions.REVERSE.z((i + 1) * (j + 1));
      }
    }
    return m;
  }

  @Override
  public Z next() {
    ++mN;
    final Matrix<Z> mat = new DefaultMatrix<>(matrix(mN), Z.ZERO);
    return new MatrixField<>(mN, IntegerField.SINGLETON).permanent(mat);
  }
}
