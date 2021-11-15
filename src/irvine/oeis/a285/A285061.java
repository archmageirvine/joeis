package irvine.oeis.a285;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A285061 Sheffer triangle S2[4, 1] = (exp(x), exp(4*x) - 1).
 * T(n,-1) = 0, T(0, 0) = 1, T(n,m) = 0 if n &lt; m. T(n,m) = 4*T(n-1,m-1) + (1 + 4*m)*T(n-1,m) for n &gt;= 1, m = 0..n.
 * @author Georg Fischer
 */
public class A285061 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n - 1, k - 1).multiply(4).add(get(n - 1, k).multiply(1 + 4 * k));
  }
}
