package irvine.oeis.a268;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A268634 Number of n X 3 0..2 arrays with some element plus some horizontally or vertically adjacent neighbor totalling two exactly once.
 * @author Georg Fischer
 */
public class A268634 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A268634() {
    super(1, "[0,12,0,-12,18]", "[1,-10,29,-20,4]");
  }
}
