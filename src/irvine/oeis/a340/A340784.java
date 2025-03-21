package irvine.oeis.a340;
// Generated by gen_seq4.pl 2025-03-07.ack/filtpos at 2025-03-07 21:14

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.FilterSequence;
import irvine.oeis.a373.A373381;

/**
 * A340784 Heinz numbers of even-length integer partitions of even numbers.
 * @author Georg Fischer
 */
public class A340784 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A340784() {
    super(1, 1, new A373381(), FilterSequence.EVEN);
  }
}
