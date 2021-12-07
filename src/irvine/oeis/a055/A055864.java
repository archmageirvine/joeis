package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A055864 Coefficient triangle for certain polynomials.
 * a(n, m)=0 if n &lt; m; a(n, m)= n^(m-1)*(n+1)^(n-m), n &gt;= m &gt;= 1;
 * @author Georg Fischer
 */
public class A055864 extends Triangle {

  @Override
  public Z compute(final int n, final int k) {
    if (n == 0) {
      return Z.ONE;
    }
    return Z.valueOf(n + 1).pow(k).multiply(Z.valueOf(n + 2).pow(n - k));
  }
}
