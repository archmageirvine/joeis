package irvine.oeis.a222;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A222439 Number of n X 3 0..3 arrays with entries increasing mod 4 by 0, 1 or 2 rightwards and downwards, starting with upper left zero.
 * @author Georg Fischer
 */
public class A222439 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A222439() {
    super(1, "[0,9,-15]", "[1,-18,27]");
  }
}
