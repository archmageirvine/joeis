package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A087322 Triangle T read by rows: T(n, 1) = 2*n + 1. For 1 &lt; k &lt;= n, T(n, k) = 2*T(n,k-1) + 1.
 * @author Georg Fischer
 */
public class A087322 extends Triangle {

  /** Construct the sequence. */
  public A087322() {
    setOffset(1);
    hasRAM(false);
  }

  @Override
  public Z compute(final int n, final int k) {
    return k == 0 ? Z.valueOf(2 * n + 3) : get(n, k - 1).multiply2().add(1);
  }
}
