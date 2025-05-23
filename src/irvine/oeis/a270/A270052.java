package irvine.oeis.a270;
// Generated by gen_seq4.pl 2024-12-28.ack/lingfcj at 2024-12-28 22:36

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A270052 Number of nX2 0..4 arrays with some element plus some horizontally or vertically adjacent neighbor totalling four exactly once.
 * @author Georg Fischer
 */
public class A270052 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A270052() {
    super(1, "[0,5,110,5]", "[1,-26,169]");
  }
}
