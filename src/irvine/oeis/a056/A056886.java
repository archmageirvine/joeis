package irvine.oeis.a056;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056886 Determinant of the n X n Hankel matrix whose entries are s_2 (i+j), 0 &lt;= i, j &lt; n, where s_2 is the sum of the base-2 bits.
 * @author Sean A. Irvine
 */
public class A056886 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Matrix<Z> mat = new DefaultMatrix<>(mN, mN, Z.ZERO);
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j < mN; ++j) {
        mat.set(k, j, Z.valueOf(Long.bitCount(k + j)));
      }
    }
    return new MatrixRing<>(mN, Integers.SINGLETON).det(mat);
  }
}
