package irvine.oeis.a392;

import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392133 a(n) is the permanent of the symmetric n X n matrix M defined by M(i,j) = gcd(2i-1,2j-1) for 1 &lt;= i,j &lt;= n.
 * @author Sean A. Irvine
 */
public class A392133 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final Matrix<Z> m = new DefaultMatrix<>(++mN, mN, Z.ZERO);
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j < k; ++j) {
        final Z g = Functions.GCD.z(2L * k + 1, 2L * j + 1);
        m.set(k, j, g);
        m.set(j, k, g);
      }
      m.set(k, k, Z.valueOf(2L * k + 1));
    }
    return new MatrixField<>(mN, IntegerField.SINGLETON).permanent(m);
  }
}
