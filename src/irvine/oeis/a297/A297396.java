package irvine.oeis.a297;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A297396 Number of 3 X n 0..1 arrays with every 1 horizontally, diagonally or antidiagonally adjacent to 1 neighboring 1.
 * @author Georg Fischer
 */
public class A297396 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A297396() {
    super(1, "[0,1,8,9,1,-2,-2]", "[1,-1,-1,-8,-1,0,2]");
  }
}
