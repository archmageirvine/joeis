package irvine.oeis.a228;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A228479 Number of n X 5 binary arrays with top left value 1 and no two ones adjacent horizontally, vertically or antidiagonally.
 * @author Georg Fischer
 */
public class A228479 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A228479() {
    super(1, "[0,5,4,-5,-18,16,-6,0,1]", "[1,-3,-15,-16,11,20,-19,8,0,-1]");
  }
}
