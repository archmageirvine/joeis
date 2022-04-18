package irvine.oeis.a157;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A157654 Triangle T(n, k, m) = 1 if k = 0 or k = n, otherwise m*abs( (n-k)^(m-1) - k^(m-1) ), with m = 2, read by rows.
 * @author Georg Fischer
 */
public class A157654 extends Triangle {

  /** Construct the sequence. */
  public A157654() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 || n == k ? Z.ONE : Z.valueOf(n - k).subtract(k).abs().multiply2();
  }
}
