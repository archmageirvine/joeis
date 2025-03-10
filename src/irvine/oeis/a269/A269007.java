package irvine.oeis.a269;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A269007 Number of n X 4 binary arrays with some element plus some horizontally, diagonally or antidiagonally adjacent neighbor totalling two exactly once.
 * @author Georg Fischer
 */
public class A269007 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A269007() {
    super(1, "[0,5,-24,73,-124,60,16,4]", "[1,-12,40,-8,-92,32,64]");
  }
}
