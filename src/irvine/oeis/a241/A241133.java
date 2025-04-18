package irvine.oeis.a241;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A241133 Number of n X 2 0..2 arrays with no element equal to the same number of vertical neighbors as horizontal neighbors, with new values 0..2 introduced in row major order.
 * @author Georg Fischer
 */
public class A241133 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A241133() {
    super(1, "[0,1,-2,-5,4,6,-4]", "[1,-4,-2,11,6,-8]");
  }
}
