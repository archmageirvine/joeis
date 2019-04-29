package irvine.oeis.a307;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.SmallDenseMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A307651 <code>a(n)</code> is the determinant of the Vandermonde matrix of the digits of n.
 * @author Sean A. Irvine
 */
public class A307651 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    final MatrixRing<Z> r = new MatrixRing<>(s.length(), Integers.SINGLETON);
    final Matrix<Z> m = new SmallDenseMatrix<>(s.length(), s.length(), Z.ZERO);
    for (int k = 0; k < s.length(); ++k) {
      final Z e = Z.valueOf(s.charAt(k) - '0');
      for (int j = 0; j < s.length(); ++j) {
        m.set(k, j, e.pow(j));
      }
    }
    return r.det(m);
  }
}
