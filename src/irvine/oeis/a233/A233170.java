package irvine.oeis.a233;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A233170 Number of n X 4 0..5 arrays with no element x(i,j) adjacent to itself or value 5-x(i,j) horizontally, diagonally or antidiagonally, top left element zero, and 1 appearing before 2 3 and 4, and 2 appearing before 3 in row major order (unlabeled 6-colorings with no clashing color pairs).
 * @author Georg Fischer
 */
public class A233170 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A233170() {
    super(1, "[0,10,-480,4096]", "[1,-128,2816,-16384]");
  }
}
