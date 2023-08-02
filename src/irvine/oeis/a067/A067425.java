package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A067425 Triangle with columns built from certain power sequences.
 * @author Georg Fischer
 */
public class A067425 extends BaseTriangle {

  @Override
  public Z triangleElement(final int n, final int m) {
    // a(n, m) = 1 if n=m; a(n, m)= (m+4)*(4*(m+1))^(n-m-1) if n > m >= 0, else 0.
    return (n == m) ? Z.ONE : Z.valueOf(4L * m + 4).pow(n - m - 1).multiply(m + 4);
  }
}
