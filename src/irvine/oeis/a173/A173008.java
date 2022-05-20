package irvine.oeis.a173;
// manually trecpas

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A173008 Triangle T(n,k) read by rows: coefficient [x^k] of the polynomial Product_{i=1..n} (x + q^i) in row n, column 0&lt;=k&lt;=n, and q = 4.
 * @author Georg Fischer
 */
public class A173008 extends Triangle {

  /** Construct the sequence. */
  public A173008() {
    hasRAM(false);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n - 1, k - 1).add(get(n - 1, k).multiply(Z.FOUR.pow(n)));
  }
}
