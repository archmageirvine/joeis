package irvine.oeis.a143;
// manually trecpas/trecpas1

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A143494 Triangle read by rows: 2-Stirling numbers of the second kind.
 * @author Georg Fischer
 */
public class A143494 extends Triangle {

  private int mStir;

  /** Construct the sequence. */
  public A143494() {
    this(2);
  }

  /**
   * Generic constructor with parameter.
   * @param stir unsigned <code>stir</code>-stirling numbers
   */
  public A143494(final int stir) {
    super(stir);
    hasRAM(false);
    mStir = stir;
  }

  @Override
  protected Z compute(int n, int k) {
    n += mStir;
    k += mStir;
    return n == mStir ? Z.ONE : get(n - 1 - mStir, k - 1 - mStir).add(get(n - 1 - mStir, k - mStir).multiply(k));
  }
}
