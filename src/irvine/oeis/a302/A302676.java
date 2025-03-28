package irvine.oeis.a302;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A302676 Number of n X 4 0..1 arrays with every element equal to 0, 1, 4 or 6 horizontally, diagonally or antidiagonally adjacent elements, with upper left element zero.
 * @author Georg Fischer
 */
public class A302676 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A302676() {
    super(1, "[0,5,0,-3,-2,-6,-4,3,2]", "[1,-1,-2,0,1]");
  }
}
