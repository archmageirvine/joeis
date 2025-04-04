package irvine.oeis.a269;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A269030 Number of n X 3 0..2 arrays with some element plus some horizontally, diagonally or antidiagonally adjacent neighbor totalling two exactly once.
 * @author Georg Fischer
 */
public class A269030 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A269030() {
    super(1, "[0,12,-72,216,-192,48]", "[1,-10,29,-20,4]");
  }
}
