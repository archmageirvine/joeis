package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086065 Permanent of the n X n matrix whose element (i,j) equals sigma(|i-j|) where sigma(n) is the sum of divisors of n and sigma(0) = 0.
 * @author Sean A. Irvine
 */
public class A086065 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final DefaultMatrix<Z> m = new DefaultMatrix<>(++mN, mN, Z.ZERO);
    for (long k = 0; k < mN; ++k) {
      for (long j = 0; j < mN; ++j) {
        final long v = Math.abs(k - j);
        if (v != 0) {
          m.set(k, j, Functions.SIGMA1.z(v));
        }
      }
    }
    return new MatrixField<>(mN, IntegerField.SINGLETON).permanent(m);
  }
}

