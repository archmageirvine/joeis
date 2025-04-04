package irvine.oeis.a228;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A228658 Number of n X 6 binary arrays with top left value 1 and no two ones adjacent horizontally, diagonally or antidiagonally.
 * @author Georg Fischer
 */
public class A228658 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A228658() {
    super(1, "[0,8,-32,-16,92,12,-32]", "[1,-14,17,142,-59,-352,-103,48]");
  }
}
