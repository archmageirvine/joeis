package irvine.oeis.a057;

import irvine.math.group.MatrixField;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a005.A005114;

/**
 * A057980 Let n be a positive integer, n&gt;3. Define a tournament on the vertex set {2,3,..,n} by: for i &lt; j, i is adjacent to j if i divides j, else j is adjacent to i. If T(n) denotes its adjacency matrix, then the above sequence is det(T(n))for n=4,5,6....42.
 * @author Sean A. Irvine
 */
public class A057980 extends A005114 {

  private int mN = 2;

  @Override
  public Z next() {
    final DefaultMatrix<Q> mat = new DefaultMatrix<>(++mN, mN, Q.ZERO);
    for (int k = 2; k < mN + 2; ++k) {
      for (int j = 2; j < k; ++j) {
        if (k % j == 0) {
          mat.set(j - 2, k - 2, Q.ONE);
        } else{
          mat.set(k - 2, j - 2, Q.ONE);
        }
      }
    }
    return new MatrixField<>(mN, Rationals.SINGLETON).det(mat).toZ();
  }
}
