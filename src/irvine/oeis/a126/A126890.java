package irvine.oeis.a126;
// Generated by gen_seq4.pl tresimple at 2023-07-12 12:04

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A126890 Triangle read by rows: T(n,k) = n*(n+2*k+1)/2, 0 &lt;= k &lt;= n.
 * @author Georg Fischer
 */
public class A126890 extends Triangle {

  /** Construct the sequence. */
  public A126890() {
    setOffset(0);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(n * (n + 2L * k + 1) / 2);
  }
}
