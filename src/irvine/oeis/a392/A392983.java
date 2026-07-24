package irvine.oeis.a392;

import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392983 a(n) is the absolute value of the determinant of the symmetric n X n matrix M defined by M[i,j] = gcd(i,j) for 0 &lt;= i,j &lt;= n-1.
 * @author Sean A. Irvine
 */
public class A392983 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Matrix<Z> m = new DefaultMatrix<>(mN, mN, Z.ZERO);
    for (long k = 0; k < mN; ++k) {
      for (long j = 0; j < mN; ++j) {
        m.set(k, j, Functions.GCD.z(k, j));
      }
    }
    return new MatrixField<>(mN, IntegerField.SINGLETON).det(m).abs();
  }
}
