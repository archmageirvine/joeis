package irvine.oeis.a086;

import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086094 Permanent of the n X n matrix whose element (i,j) equals t(|i-j|) where t(n) is the number of divisors of n and t(0) = 0.
 * @author Sean A. Irvine
 */
public class A086094 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Matrix<Z> mat = new DefaultMatrix<>(mN, mN, Z.ZERO);
    for (long k = 0; k < mN; ++k) {
      for (long j = 0; j < k; ++j) {
        final Z p = Functions.SIGMA0.z(Math.abs(k - j));
        mat.set(k, j, p);
        mat.set(j, k, p);
      }
    }
    return new MatrixField<>(mN, IntegerField.SINGLETON).permanent(mat);
  }
}

