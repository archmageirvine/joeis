package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A055096 Triangle read by rows, sums of 2 distinct nonzero squares: T(n,k) = k^2+n^2, (n&gt;=2, 1 &lt;= k &lt;= n-1).
 * @author Georg Fischer
 */
public class A055096 extends Triangle {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A055096(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A055096() {
    setOffset(2);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(n + 2).multiply(n + 2).add((k + 1) * (k + 1));
  }
}
