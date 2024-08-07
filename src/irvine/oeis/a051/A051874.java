package irvine.oeis.a051;
// Generated by gen_seq4.pl 2024-06-01/polygonal at 2024-06-01 22:47

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A051874 22-gonal numbers: a(n) = n*(10*n-9).
 * @author Georg Fischer
 */
public class A051874 extends LinearRecurrence implements DirectSequence {

  /** Construct the sequence. */
  public A051874() {
    super(0, new long[] {1, -3, 3}, new long[] {0, 1, 22});
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n).multiply(n * 20L - 18).divide2();
  }

  @Override
  public Z a(final Z n) {
    return n.multiply(n.multiply(20).subtract(18)).divide2();
  }
}
