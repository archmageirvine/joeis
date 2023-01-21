package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A067410 Triangle with columns built from certain power sequences.
 * @author Georg Fischer
 */
public class A067410 extends BaseTriangle {

  @Override
  public Z triangleElement(final int n, final int m) {
    // a(n, m) = 1 if n = m; a(n, m) = (m+2)*(2*(m+1))^(n-m-1) if n > m >= 0.
    return (n == m) ? Z.ONE : Z.valueOf(2 * m + 2).pow(n - m - 1).multiply(m + 2);
  }
}
