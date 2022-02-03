package irvine.oeis.a143;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A143497 Triangle of unsigned 2-Lah numbers.
 * Recurrence: <code>T(n,k) = (n+k-1)*T(n-1,k) + T(n-1,k-1) for n,k &gt;= 2</code>.
 * @author Georg Fischer
 */
public class A143497 extends Triangle {

  protected int mLah2;

  /** Construct the sequence. */
  public A143497() {
    this(2);
  }

  /**
   * Generic constructor with parameter
   * @param lah Lah number
   */
  public A143497(final int lah) {
    mLah2 = 2 * lah - 1;
  }

  @Override
  public Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n - 1, k).multiply(n + k + mLah2).add(get(n - 1, k - 1));
  }
}
