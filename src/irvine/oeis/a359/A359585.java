package irvine.oeis.a359;
// Generated by gen_seq4.pl 2025-03-06.ack/filtpos at 2025-03-06 22:47

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a329.A329697;

/**
 * A359585 Positions of even terms in A329697.
 * @author Georg Fischer
 */
public class A359585 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A359585() {
    super(1, 1, new A329697(), EVEN);
  }
}
