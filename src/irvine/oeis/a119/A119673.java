package irvine.oeis.a119;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A119673 T(n, k) = 3*T(n-1, k-1) + T(n-1, k) for k &lt; n and T(n, n) = 1, T(n, k) = 0, if k &lt; 0 or k &gt; n; triangle read by rows.
 * @author Georg Fischer
 */
public class A119673 extends Triangle {

  /** Construct the sequence. */
  public A119673() {
    hasRAM(false);
  }

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 || k == n ? Z.ONE : get(n - 1, k - 1).multiply(3).add(get(n - 1, k));
  }
}
