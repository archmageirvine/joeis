package irvine.oeis.a206;
// manually 2026-01-07; gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A206570 Number of n X 1 0..3 arrays avoiding the pattern z-1 z-1 z in any row, column or nw-to-se diagonal.
 * @author Georg Fischer
 */
public class A206570 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A206570() {
    super(1, "[0,4,0,-3,0,2,0,-1]", "[1,-4,0,3,0,-2,0,1]");
  }
}
