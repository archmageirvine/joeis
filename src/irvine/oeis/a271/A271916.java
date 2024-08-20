package irvine.oeis.a271;
// manually 2024-08-08/arrlamb at 2024-08-18 15:55

import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaArray;

/**
 * A271916 Array read by antidiagonals: T(m,n) (m&gt;=1, n&gt;=1) = f(m,n) if m &lt;= n or f(n,m) if n &lt; m, where f(m,n) = m*(m-1)*(3*n-m-1)/6.
 * @author Georg Fischer
 */
public class A271916 extends LambdaArray {

  private static Z f(final int m, final int n) {
    return Z.valueOf(m).multiply(m - 1).multiply(3 * n - m - 1).divide(6);
  }

  /** Construct the sequence. */
  public A271916() {
    super(1, 1, 1, -1, (m, n) -> (m <= n) ? f(m, n) : f(n, m));
  }
}
