package irvine.oeis.a193;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A193588 A Fibonacci triangle: T(n,k) = Fib(k+2) for 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A193588 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    if (n == 0 || k == 0) {
      return Z.ONE;
    } else if (k == 1) {
      return Z.TWO;
    } else {
      return get(n, k - 2).add(get(n, k - 1));
    }
  }
}
