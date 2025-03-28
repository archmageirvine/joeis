package irvine.oeis.a320;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A320097 Number of no-leaf subgraphs of the 4 X n grid.
 * @author Georg Fischer
 */
public class A320097 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A320097() {
    super(1, "[0,1,-21,-70,10,14,-3]", "[1,-36,7,201,-49,-20,5]");
  }
}
