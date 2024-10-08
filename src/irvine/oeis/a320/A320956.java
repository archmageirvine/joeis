package irvine.oeis.a320;
// Generated by gen_seq4.pl 2024-08-26.ack/sintrif at 2024-08-26 22:41

import irvine.math.function.Functions;
import irvine.oeis.a000.A000111;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A320956 a(n) = A000110(n) * A000111(n). The exponential limit of sec + tan. Row sums of A373428.
 * @author Georg Fischer
 */
public class A320956 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A320956() {
    super(0, (term, n) -> Functions.BELL.z(n).multiply(term), "", new A000111());
  }
}
