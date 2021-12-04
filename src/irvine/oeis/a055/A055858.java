package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A055858 Coefficient triangle for certain polynomials.
 * a(n, m)=0 if n &lt; m; a(0, 0)=1, a(n, 0) = n^n, n &gt;= 1, a(n, m) = n^(m-1)*(n+1)^(n-m+1), n &gt;= m &gt;= 1;
 * @author Georg Fischer
 */
public class A055858 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    if (n == 0) {
      return Z.ONE;
    } else if (k == 0) {
      return Z.valueOf(n).pow(n);
    }
    return Z.valueOf(n).pow(k - 1).multiply(Z.valueOf(n + 1).pow(n - k + 1));
  }
}
