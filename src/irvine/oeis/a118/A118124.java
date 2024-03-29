package irvine.oeis.a118;
// Generated by gen_seq4.pl tresimple at 2023-07-12 12:04

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A118124 Triangle T(n,m) = (n+m)^2+n+m+41, read by rows.
 * @author Georg Fischer
 */
public class A118124 extends Triangle {

  /** Construct the sequence. */
  public A118124() {
    setOffset(0);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(n + k).square().add(n + k + 41);
  }
}
