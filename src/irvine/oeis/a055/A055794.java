package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A055794 Triangle T read by rows: T(i,0)=1 for i &gt;= 0; T(i,i)=1 for i=0,1,2,3; T(i,i)=0 for i &gt;= 4; T(i,j) = T(i-1,j) + T(i-2,j-1) for 1&lt;=j&lt;=i-1.
 * T(i,j) = T(i-1,j) + T(i-2,j-1) for 1&lt;=j&lt;=i-1.
 * @author Georg Fischer
 */
public class A055794 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    if (n == k) {
      return n <= 3 ? Z.ONE : Z.ZERO;
    } else if (k == 0) {
      return Z.ONE;
    }
    return get(n - 1, k).add(get(n - 2, k - 1));
  }
}
