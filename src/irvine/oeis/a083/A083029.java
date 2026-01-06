package irvine.oeis.a083;

import irvine.math.api.Matrix;
import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.a080.A080858;

/**
 * A083029 Triangle read by rows: T(n,k), n &gt;=1, 0 &lt;= k &lt;= C(n,k), = number of n X n symmetric positive semi-definite matrices with 2's on the main diagonal and 1's and 0's elsewhere and with k 1's above the diagonal.
 * @author Sean A. Irvine
 */
public class A083029 extends A080858 {

  @Override
  protected boolean is(final DefaultMatrix<Q> m) {
    final MatrixField<Q> fld = new MatrixField<>(mN, Rationals.SINGLETON);
    if (fld.det(m).signum() < 0) {
      return false;
    }
    Matrix<Q> s = m;
    for (int k = mN - 1; k > 0; --k) {
      s = s.delete(k, k);
      final MatrixField<Q> f = new MatrixField<>(k, Rationals.SINGLETON);
      if (f.det(s).signum() < 0) {
        return false;
      }
    }
    //System.out.println(m);
    return true;
  }
}

