package irvine.oeis.a193;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A193636 Triangle: T(n,k) = C(3n-2k,k), 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A193636 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return Binomial.binomial(3L * n - 2L * k, k);
  }
}
