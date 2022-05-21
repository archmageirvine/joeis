package irvine.oeis.a111;
// manually trecpas

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A111636 Triangle read by rows: T(n,k) (0&lt;=k&lt;=n) is the number of labeled graphs having k blue nodes and n-k green ones and only nodes of different colors can be joined by an edge.
 * @author Georg Fischer
 */
public class A111636 extends Triangle {

  /** Construct the sequence. */
  public A111636() {
    hasRAM(true);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : Binomial.binomial(n, k).multiply(Z.ONE.shiftLeft(k * (n - k)));
  }
}
