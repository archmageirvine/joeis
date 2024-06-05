package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062381 Let A_n be the n X n matrix defined by A_n[i,j] = 1/F(i+j-1) for 1&lt;=i,j&lt;=n where F(k) is the k-th Fibonacci number (A000045). Then a_n = 1/det(A_n).
 * @author Sean A. Irvine
 */
public class A062381 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final MatrixField<Q> fld = new MatrixField<>(++mN, Rationals.SINGLETON);
    final DefaultMatrix<Q> mat = new DefaultMatrix<>(mN, mN, Q.ZERO);
    for (int r = 0; r < mN; ++r) {
      for (int c = 0; c < mN; ++c) {
        mat.set(r, c, new Q(Z.ONE, Functions.FIBONACCI.z(r + c + 1)));
      }
    }
    return fld.det(mat).reciprocal().toZ();
  }
}
