package irvine.oeis.a227;
// Generated by gen_seq4.pl 2025-06-15.ack/filtpos at 2025-06-15 21:33

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a034.A034968;

/**
 * A227148 Numbers k for which the sum of digits is even when k is written in the factorial base (A007623).
 * @author Georg Fischer
 */
public class A227148 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A227148() {
    super(1, 0, new A034968(), EVEN);
  }
}
