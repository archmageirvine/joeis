package irvine.oeis.a100;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A100100 Triangle T(n,k) = binomial(2*n-k-1, n-k) read by rows.
 * @author Georg Fischer
 */
public class A100100 extends BaseTriangle {

  @Override
  public Z triangleElement(final int n, final int k) {
    return Binomial.binomial(2 * n - k - 1, n - k);
  }
}
