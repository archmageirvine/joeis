package irvine.oeis.a233;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A233093 Number of n X 3 0..3 arrays with no element x(i,j) adjacent to value 3-x(i,j) horizontally, diagonally or antidiagonally, top left element zero, and 1 appearing before 2 in row major order.
 * @author Georg Fischer
 */
public class A233093 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A233093() {
    super(1, "[0,5,-15,6]", "[1,-16,21,-6]");
  }
}
