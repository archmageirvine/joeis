package irvine.oeis.a268;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A268803 Number of n X 2 0..2 arrays with some element plus some horizontally, vertically or antidiagonally adjacent neighbor totalling two not more than once.
 * @author Georg Fischer
 */
public class A268803 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A268803() {
    super(1, "[0,9,16,9,-2,2,6,3]", "[1,-2,-3,2,6,4,1]");
  }
}
