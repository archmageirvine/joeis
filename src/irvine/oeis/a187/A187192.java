package irvine.oeis.a187;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A187192 Number of 5-turn rook's tours on an n X n board summed over all starting positions.
 * @author Georg Fischer
 */
public class A187192 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A187192() {
    super(1, "[0,0,0,720,4752,5376,672]", "[1,-7,21,-35,35,-21,7,-1]");
  }
}
