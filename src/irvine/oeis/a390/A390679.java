package irvine.oeis.a390;

import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390679 a(n) is the permanent of the square matrix A(n) of order 2*n whose generic entry is A(i, j) = n*(2*i - (-1)^i - 3) + 2*j - (-1)^j/2 + (-1)^i - 3/2 with 1 &lt;= i,j &lt;= 2*n.
 * @author Sean A. Irvine
 */
public class A390679 extends Sequence0 {

  private int mN = -1;

  private Q t(final int k, final int j, final int n) {
    return Q.valueOf(2L * k - ((k & 1) == 0 ? 1 : -1) - 3).multiply(n).add(new Q(4L * j - ((j & 1) == 0 ? 1 : -1) + ((k & 1) == 0 ? 2 : -2) - 3, 2));
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final DefaultMatrix<Q> mat = new DefaultMatrix<>(2L * mN, 2L * mN, Q.ZERO);
    for (int k = 0; k < 2 * mN; ++k) {
      for (int j = 0; j < 2 * mN; ++j) {
        mat.set(k, j, t(k + 1, j + 1, mN));
      }
    }
    return new MatrixField<Q>(mN, Rationals.SINGLETON).permanent(mat).toZ();
  }
}
