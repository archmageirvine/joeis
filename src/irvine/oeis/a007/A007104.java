package irvine.oeis.a007;

import irvine.math.group.IntegerField;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007104.
 * @author Sean A. Irvine
 */
public class A007104 implements Sequence {

  protected static final MatrixField<Z> MAT = new MatrixField<>(2, IntegerField.SINGLETON);
  private long mN = 0;

  protected boolean accept(final DefaultMatrix<Z> matrix, final Z n) {
    return Z.NEG_ONE.equals(MAT.det(matrix)) && n.equals(MAT.trace(matrix));
  }

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final DefaultMatrix<Z> matrix = new DefaultMatrix<>(2, 2, Z.ZERO);
    long count = 0;
    for (long d = 0; d <= mN; ++d) {
      matrix.set(1, 1, Z.valueOf(d));
      for (long b = 0; b <= d; ++b) {
        matrix.set(0, 1, Z.valueOf(b));
        for (long c = 0; c <= d; ++c) {
          matrix.set(1, 0, Z.valueOf(c));
          for (long a = 0; a <= Math.min(b, c); ++a) {
            matrix.set(0, 0, Z.valueOf(a));
            if (accept(matrix, n)) {
              ++count;
            }
          }
        }
      }
    }
    return Z.valueOf(count);
  }
}
