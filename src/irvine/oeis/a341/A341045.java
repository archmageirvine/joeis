package irvine.oeis.a341;
// Generated by gen_seq4.pl 2025-05-26.ack/filtpos at 2025-05-26 23:11

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a318.A318996;

/**
 * A341045 Numbers k such that k divides A318996(k).
 * @author Georg Fischer
 */
public class A341045 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A341045() {
    super(1, 1, new A318996(), (k, v) -> v.mod(k) == 0);
  }
}
