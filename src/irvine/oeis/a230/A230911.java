package irvine.oeis.a230;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A230911 Number of n X 4 0..7 arrays x(i,j) with each element horizontally or antidiagonally next to at least one element with value (x(i,j)+1) mod 8, and upper left element zero.
 * @author Georg Fischer
 */
public class A230911 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A230911() {
    super(1, "[0,0,0,8,-26,110,-94,2]", "[1,-18,91,-469,919,-2152,93,-1]");
  }
}
