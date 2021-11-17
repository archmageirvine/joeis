package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A053199 Triangular array T: put T(n, 0)=n+1 for all n &gt;= 0 and all other T(n,k)=0;
 * then put T(n,k)=Sum{T(i,j): 0&lt;=j&lt;=i-n+k, n-k&lt;=i&lt;=n}.
 * @author Georg Fischer
 */
public class A053199 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    if (k == 0) {
      return Z.valueOf(n + 1);
    } else {
      Z sum = get(n - 1, k - 1);
      if (k > 1) {
        sum = sum.multiply2();
      }
      for (int j = 0; j < k; ++j) {
        sum = sum.add(get(n, j));
      }
      return sum;
    }
  }
}
