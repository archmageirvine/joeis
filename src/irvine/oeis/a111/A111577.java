package irvine.oeis.a111;
// manually A225466/tripas

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A111577 Galton triangle T(n, k) = T(n-1, k-1) + (3k-2)*T(n-1, k) read by rows.
 * @author Georg Fischer
 */
public class A111577 extends Triangle {

  /** Construct the sequence. */
  public A111577() {
    hasRAM(false);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 || k == 0 ? Z.ONE : get(n - 1, k - 1).add(get(n - 1, k).multiply(3 * k + 1));
  }
}
