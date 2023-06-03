package irvine.oeis.a099;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A099039 Riordan array (1,c(-x)), where c(x) = g.f. of Catalan numbers.
 * @author Georg Fischer
 */
public class A099039 extends BaseTriangle {

  /** Construct the sequence. */
  public A099039() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    // T(n, k) = (-1)^(n+k)*binomial(2*n-k-1, n-k)*k/n for 0 <= k <= n with n > 0; T(0, 0) = 1
    return (n == 0) ? Z.ONE : Binomial.binomial(2 * n - k - 1, n - k).multiply((((n + k) & 1) == 1) ? -1 : 1).multiply(k).divide(n);
  }
}
