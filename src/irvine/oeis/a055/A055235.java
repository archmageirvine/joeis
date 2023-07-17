package irvine.oeis.a055;
// manually 2021-10-18

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A055235 Sums of two powers of 3.
 * @author Georg Fischer
 */
public class A055235 extends Triangle {

  protected Z mBase;

  /** Construct the sequence. */
  public A055235() {
    this(0, 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param base
   */
  public A055235(final int offset, final int base) {
    super(offset);
    hasRAM(true);
    mBase = Z.valueOf(base);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return (k < 0 || k > n) ? Z.ZERO : mBase.pow(n).add(mBase.pow(k));
  }
}
