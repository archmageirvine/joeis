package irvine.oeis.a230;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A230905 Number of n X 3 0..3 arrays x(i,j) with each element horizontally, vertically or antidiagonally next to at least one element with value (x(i,j)+1) mod 4, no adjacent elements equal, and upper left element zero.
 * @author Georg Fischer
 */
public class A230905 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A230905() {
    super(1, "[0,0,8,-42,68,0,-102,64,32,-20,2,-2]", "[1,-10,37,-65,51,-2,-20,10,-4]");
  }
}
