package irvine.oeis.a183;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A183053 Sums of knight's moves over the square |i|+|j|&lt;=n on infinite chessboard.
 * @author Georg Fischer
 */
public class A183053 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A183053() {
    super(0, "[0,12,4,16,0,16,0,4,4,-8,16,-8,8,-8]", "[1,-2,2,-4,5,-4,5,-4,2,-2,1]");
  }
}
