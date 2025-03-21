package irvine.oeis.a187;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A187174 Number of 4-step left-handed knight's tours (moves only out two, left one) on an n X n board summed over all starting positions.
 * @author Georg Fischer
 */
public class A187174 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A187174() {
    super(1, "[0,0,0,0,8,24,56,-8,-8]", "[1,-3,3,-1]");
  }
}
