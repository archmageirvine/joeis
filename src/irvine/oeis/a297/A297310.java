package irvine.oeis.a297;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A297310 Number of n X 4 0..1 arrays with every 1 horizontally or antidiagonally adjacent to 1 or 2 neighboring 1s.
 * @author Georg Fischer
 */
public class A297310 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A297310() {
    super(1, "[0,7,38,51,-50,-93,50,2,-10,1]", "[1,-4,-26,-22,43,1,-7,1,1]");
  }
}
