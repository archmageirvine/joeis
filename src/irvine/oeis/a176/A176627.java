package irvine.oeis.a176;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A176627 Triangle T(n, k) = 12^(k*(n-k)), read by rows.
 * @author Georg Fischer
 */
public class A176627 extends Triangle {

  protected Z mBase;

  /** Construct the sequence. */
  public A176627() {
    this(12);
  }

  /**
   * Generic constructor with parameters
   * @param base 
   */
  public A176627(final long base) {
    mBase = Z.valueOf(base);
  }

  @Override
  public Z compute(final int n, final int k) {
    return mBase.pow(k * (n - k));
  }
}
