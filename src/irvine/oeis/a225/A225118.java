package irvine.oeis.a225;
// Generated by gen_seq4.pl trecpas

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A225118 Triangle read by rows, coefficients of the generalized Eulerian polynomials A_{n, 4}(x) in descending order.
 * @author Georg Fischer
 */
public class A225118 extends Triangle {

  /** Construct the sequence. */
  public A225118() {
    hasRAM(false);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n - 1, k - 1).multiply(4L * (n - k) + 1).add(get(n - 1, k).multiply(3 + 4L * k));
  }
}
