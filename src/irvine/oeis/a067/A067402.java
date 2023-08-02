package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A067402 Triangle with columns built from certain power sequences.
 * @author Georg Fischer
 */
public class A067402 extends BaseTriangle {

  @Override
  public Z triangleElement(final int n, final int m) {
    // a(n, m) = 1 if n=m; a(n, m) = (2*m+1)*(m+1)^(2*(n-m-1)) if n>m>=0.
    return (n == m) ? Z.ONE : Z.valueOf(m + 1).pow(2L * (n - m - 1)).multiply(2L * m + 1);
  }
}
