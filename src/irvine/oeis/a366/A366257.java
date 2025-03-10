package irvine.oeis.a366;
// Generated by gen_seq4.pl 2025-02-10.ack/filtpos at 2025-02-10 21:26

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a303.A303767;

/**
 * A366257 Positions of even numbers in May code (A303767).
 * @author Georg Fischer
 */
public class A366257 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A366257() {
    super(1, 0, new A303767(), v -> !v.testBit(0));
  }
}
