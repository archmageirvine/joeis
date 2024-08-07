package irvine.oeis.a051;
// Generated by gen_seq4.pl 2024-06-01/polygonal at 2024-06-01 22:47

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A051624 12-gonal (or dodecagonal) numbers: a(n) = n*(5*n-4).
 * @author Georg Fischer
 */
public class A051624 extends LinearRecurrence implements DirectSequence {

  /** Construct the sequence. */
  public A051624() {
    super(0, new long[] {1, -3, 3}, new long[] {0, 1, 12});
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n).multiply(n * 10L - 8).divide2();
  }

  @Override
  public Z a(final Z n) {
    return n.multiply(n.multiply(10).subtract(8)).divide2();
  }
}
