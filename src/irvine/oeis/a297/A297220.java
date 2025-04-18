package irvine.oeis.a297;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A297220 Number of n X 4 0..1 arrays with every 1 horizontally or antidiagonally adjacent to 1 neighboring 1s.
 * @author Georg Fischer
 */
public class A297220 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A297220() {
    super(1, "[0,4,12,17,10,2]", "[1,-1,-6,-11,-6,-1]");
  }
}
