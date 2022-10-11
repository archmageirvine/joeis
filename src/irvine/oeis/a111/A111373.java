package irvine.oeis.a111;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A111373 A generalized Pascal triangle.
 * @author Georg Fischer
 */
public class A111373 extends BaseTriangle {

  @Override
  public Z triangleElement(final int n, final int k) {
    if (k == n) {
      return Z.ONE;
    } else if (((n - k) % 3) == 0) {
      return Binomial.binomial(n, (n - k - 3) / 3).multiply(k + 1).multiply(3).divide(n - k);
    } else {
      return Z.ZERO;
    }
  }
}
