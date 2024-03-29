package irvine.oeis.a225;
// Generated by gen_seq4.pl A225466/trecpas

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A225117 Triangle read by rows, coefficients of the generalized Eulerian polynomials A_{n, 3}(x) in descending order.
 * @author Georg Fischer
 */
public class A225117 extends Triangle {

  /** Construct the sequence. */
  public A225117() {
    hasRAM(false);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n - 1, k - 1).multiply(3L * (n - k) + 1).add(get(n - 1, k).multiply(3L * k + 2));
  }
}
