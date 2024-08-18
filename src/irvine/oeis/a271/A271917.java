package irvine.oeis.a271;
// manually 2024-08-08/arrlamb at 2024-08-18 15:55

import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaArray;

/**
 * A271917 Array read by antidiagonals: T(m,n) (m&gt;=1, n&gt;=1) = f(m,n) if m &lt;= n or f(n,m) if n &lt; m, where f(m,n) = m*(m^2-1)*(2*n-m)/12.
 * @author Georg Fischer
 */
public class A271917 extends LambdaArray {

  private static Z f(final int m, final int n) {
    return Z.valueOf(m).pow(3).subtract(m).multiply(2 * n - m).divide(12);
  }

  /** Construct the sequence. */
  public A271917() {
    super(1, 1, 1, -1, (m, n) -> (m <= n) ? f(m, n) : f(n, m));
  }
}
