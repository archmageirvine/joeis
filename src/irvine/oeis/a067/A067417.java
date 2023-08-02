package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A067417 Triangle with columns built from certain power sequences.
 * @author Georg Fischer
 */
public class A067417 extends BaseTriangle {

  @Override
  public Z triangleElement(final int n, final int m) {
    // a(n, m) = 1 if n = m; a(n, m) = (m+3)*(3*(m+1))^(n-m-1) if n > m >= 0.
    return (n == m) ? Z.ONE : Z.valueOf(3L * m + 3).pow(n - m - 1).multiply(m + 3);
  }
}
