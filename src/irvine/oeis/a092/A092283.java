package irvine.oeis.a092;
// Generated by gen_seq4.pl tresimple at 2023-07-12 12:04

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A092283 Triangular array read by rows: T(n,k)=n+k^2, 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A092283 extends Triangle {

  /** Construct the sequence. */
  public A092283() {
    setOffset(1);
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return Z.valueOf(n + 1).add((long) (k + 1) * (k + 1));
  }
}
