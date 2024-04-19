package irvine.oeis.a137;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A137267 Chung-Graham juggling polynomials as a triangular sequence of positive coefficients.
 * @author Georg Fischer
 */
public class A137267 extends BaseTriangle {

  /** Construct the sequence. */
  public A137267() {
    super(1, 1, 1);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    return (k == 1) ? ((n == 1) ? Z.ONE : Z.valueOf(n - 1)) : Functions.FACTORIAL.z(k - 1).multiply(n - k + 1);
  }
}
