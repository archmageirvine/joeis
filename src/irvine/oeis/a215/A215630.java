package irvine.oeis.a215;
// Generated by gen_seq4.pl tresimple at 2023-07-12 12:04

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A215630 Triangle read by rows: T(n,k) = n^2 - n*k + k^2, 1 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A215630 extends Triangle {

  /** Construct the sequence. */
  public A215630() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf((long) (n + 1) * (n - k)).add((long) (k + 1) * (k + 1));
  }
}
