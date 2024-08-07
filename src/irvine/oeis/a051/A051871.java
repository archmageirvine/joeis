package irvine.oeis.a051;
// Generated by gen_seq4.pl 2024-06-01/polygonal at 2024-06-01 22:47

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A051871 19-gonal (or enneadecagonal) numbers: n(17n-15)/2.
 * @author Georg Fischer
 */
public class A051871 extends LinearRecurrence implements DirectSequence {

  /** Construct the sequence. */
  public A051871() {
    super(0, new long[] {1, -3, 3}, new long[] {0, 1, 19});
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n).multiply(n * 17L - 15).divide2();
  }

  @Override
  public Z a(final Z n) {
    return n.multiply(n.multiply(17).subtract(15)).divide2();
  }
}
