package irvine.oeis.a233;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A233013 Number of n X 3 0..3 arrays with no element x(i,j) adjacent to value 3-x(i,j) horizontally or vertically, top left element zero, and 1 appearing before 2 in row major order.
 * @author Georg Fischer
 */
public class A233013 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A233013() {
    super(1, "[0,5,-21,21]", "[1,-19,45,-27]");
  }
}
