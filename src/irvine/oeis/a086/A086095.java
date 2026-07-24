package irvine.oeis.a086;

import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086095 Permanent of the n X n matrix M where M(i,i) = 0 and for i != j, M(i,j) = mu(|i-j|) where mu( ) is the moebius function.
 * @author Sean A. Irvine
 */
public class A086095 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Matrix<Z> mat = new DefaultMatrix<>(mN, mN, Z.ZERO);
    for (long k = 0; k < mN; ++k) {
      for (long j = 0; j < k; ++j) {
        final Z p = Functions.MOBIUS.z(Math.abs(k - j));
        mat.set(k, j, p);
        mat.set(j, k, p);
      }
    }
    return new MatrixField<>(mN, IntegerField.SINGLETON).permanent(mat);
  }
}

