package irvine.oeis.a230;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A230930 Number of black-square subarrays of (n+2) X (3+2) 0..3 arrays x(i,j) with each element diagonally or antidiagonally next to at least one element with value (x(i,j)+1) mod 4, no adjacent elements equal, and upper left element zero.
 * @author Georg Fischer
 */
public class A230930 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A230930() {
    super(1, "[0,8,16,-26,-24,26,8,-32,0,16]", "[1,0,-16,0,-3,0,10,0,-24,0,16]");
  }
}
