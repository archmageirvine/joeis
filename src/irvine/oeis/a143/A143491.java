package irvine.oeis.a143;
// manually trecpas/trecpas1

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A143491 Unsigned 2-Stirling numbers of the first kind.
 * @author Georg Fischer
 */
public class A143491 extends Triangle {

  private int mStir;

  /** Construct the sequence. */
  public A143491() {
    this(2);
  }

  /**
   * Generic constructor with parameter.
   * @param stir unsigned <code>stir</code>-stirling numbers
   */
  public A143491(final int stir) {
    mStir = stir;
    hasRAM(false);
  }

  @Override
  protected Z compute(int n, int k) {
    n += mStir;
    k += mStir;
    return n == mStir ? Z.ONE : get(n - 1 - mStir, k - 1 - mStir).add(get(n - 1 - mStir, k - mStir).multiply(n - 1));
  }
}
