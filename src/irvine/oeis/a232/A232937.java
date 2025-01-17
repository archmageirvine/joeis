package irvine.oeis.a232;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A232937 Number of n X 4 0..2 arrays with no element x(i,j) adjacent to value 2-x(i,j) horizontally, vertically or antidiagonally.
 * @author Georg Fischer
 */
public class A232937 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A232937() {
    super(1, "[0,24,32,-44,-124,-46,52,12,-26,8]", "[1,-1,-10,-15,-4,6,1,-3,1]");
  }
}
