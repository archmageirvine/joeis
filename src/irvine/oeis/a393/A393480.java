package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.matrix.Hafnian;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393480 a(n) is the hafnian of the 2n X 2n symmetric matrix whose generic element M[i,j] is equal to the digit reversal of i*j.
 * @author Sean A. Irvine
 */
public class A393480 extends Sequence0 {

  private int mN = -1;

  private long[][] matrix(final int n) {
    final long[][] m = new long[n][n];
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        m[i][j] = Functions.REVERSE.l((i + 1) * (j + 1));
      }
    }
    return m;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final long[][] mat = matrix(2 * mN);
    return Hafnian.hafnian(mat);
  }
}
