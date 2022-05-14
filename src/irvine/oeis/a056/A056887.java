package irvine.oeis.a056;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a010.A010060;

/**
 * A056887 Determinant of n X n Hankel matrix whose entries are t(i+j), 0 &lt;= i, j &lt; n, where t is the Thue-Morse sequence.
 * @author Sean A. Irvine
 */
public class A056887 implements Sequence {

  private final MemorySequence mThueMorse = MemorySequence.cachedSequence(new A010060());
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Matrix<Z> mat = new DefaultMatrix<>(mN, mN, Z.ZERO);
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j < mN; ++j) {
        mat.set(k, j, mThueMorse.a(k + j));
      }
    }
    return new MatrixRing<>(mN, Integers.SINGLETON).det(mat);
  }
}
