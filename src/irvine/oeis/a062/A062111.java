package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A062111 Upper-right triangle resulting from binomial transform calculation for nonnegative integers.
 * @author Georg Fischer
 */
public class A062111 extends BaseTriangle {

  /** Construct the sequence. */
  public A062111() {
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    // T(n, k) = 2^(n-k-1)*(n+k) for 0 <= k <= n, n >= 0.
    return (n == k) ? Z.valueOf(n) : Z.ONE.shiftLeft(n - k - 1).multiply(n + k);
  }
}
