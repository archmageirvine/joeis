package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085511 Determinant of the n X n matrix whose element (i,j) equals sigma(|i-j|) where sigma(n) is the sum of divisors of n and sigma(0) = 0.
 * @author Sean A. Irvine
 */
public class A085511 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final MatrixField<Z> fld = new MatrixField<>(mN, IntegerField.SINGLETON);
    final DefaultMatrix<Z> m = new DefaultMatrix<>(mN, mN, Z.ZERO);
    for (long k = 0; k < mN; ++k) {
      for (long j = 0; j < k; ++j) {
        final Z s = Functions.SIGMA1.z(Math.abs(k - j));
        m.set(k, j, s);
        m.set(j, k, s);
      }
    }
    return fld.det(m);
  }
}
