package irvine.oeis.a355;
// Generated by gen_seq4.pl 2025-04-20.ack/multia at 2025-04-20 22:06

import irvine.oeis.DirectSequence;
import irvine.oeis.a007.A007088;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A355300 a(0) = 0; for n &gt;= 1, a(n) = a(A007088(n) mod n) + 1.
 * @author Georg Fischer
 */
public class A355300 extends MultiTransformSequence {

  private static final DirectSequence A007088 = new A007088();

  /** Construct the sequence. */
  public A355300() {
    super(0, (self, n) -> self.a(A007088.a(n).modZ(n).intValueExact()).add(1), "0");
  }
}
