package irvine.oeis.a051;
// Generated by gen_seq4.pl 2024-06-01/polygonal at 2024-06-01 22:47

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A051873 21-gonal numbers: a(n) = n*(19n - 17)/2.
 * @author Georg Fischer
 */
public class A051873 extends LinearRecurrence implements DirectSequence {

  /** Construct the sequence. */
  public A051873() {
    super(0, new long[] {1, -3, 3}, new long[] {0, 1, 21});
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n).multiply(n * 19L - 17).divide2();
  }

  @Override
  public Z a(final Z n) {
    return n.multiply(n.multiply(19).subtract(17)).divide2();
  }
}
