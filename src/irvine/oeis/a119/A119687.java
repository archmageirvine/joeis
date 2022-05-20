package irvine.oeis.a119;
// manually trecpas

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A119687 f-Pascal's triangle where f(n) = n^2 = A000290(n).
 * @author Georg Fischer
 */
public class A119687 extends Triangle {

  /** Construct the sequence. */
  public A119687() {
    hasRAM(false);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return k == 0 || k == n ? Z.ONE : get(n - 1, k - 1).pow(2).add(get(n - 1, k).pow(2));
  }
}
