package irvine.oeis.a119;
// manually trecpas

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A119731 f-Pascal's triangle where f(n) = n^3 = A000578(n).
 * @author Georg Fischer
 */
public class A119731 extends Triangle {

  /** Construct the sequence. */
  public A119731() {
    hasRAM(false);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n - 1, k - 1).pow(3).add(get(n - 1, k).pow(3));
  }
}
