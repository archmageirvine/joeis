package irvine.oeis.a073;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A073107 Triangle T(n,k) read by rows, where e.g.f. for T(n,k) is exp((1+y)*x)/(1-x) (with n &gt;= 0 and 0 &lt;= k &lt;= n).
 * T(n,k) = n * T(n-1,k) + binomial(n,k) for 0 &lt;= k &lt;= n with initial values T(0, 0) = 1 and T(i,j) = 0 if j &lt; 0 or j &gt; i.
 * @author Georg Fischer
 */
public class A073107 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n - 1, k).multiply(n).add(Binomial.binomial(n, k));
  }
}
