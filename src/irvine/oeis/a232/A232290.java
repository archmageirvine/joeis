package irvine.oeis.a232;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A232290 Number of n X 3 0..2 arrays with every 0 next to a 1 and every 1 next to a 2 horizontally or antidiagonally.
 * @author Georg Fischer
 */
public class A232290 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A232290() {
    super(1, "[0,7,13,9]", "[1,-12,-20,-9]");
  }
}
