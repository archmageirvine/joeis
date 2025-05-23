package irvine.oeis.a181;
// Generated by gen_seq4.pl 2025-04-04.ack/multraf at 2025-04-04 23:53

import irvine.math.function.Functions;
import irvine.oeis.a002.A002956;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A181887 a(0) = 0, and for n &gt; 0, a(n) = A002956(n) - A000041(n).
 * @author Georg Fischer
 */
public class A181887 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A181887() {
    super(0, (self, n) -> self.s(0).subtract(Functions.PARTITIONS.z(n)), "0", new A002956());
  }
}
