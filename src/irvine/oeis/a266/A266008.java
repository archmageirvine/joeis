package irvine.oeis.a266;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A266008 Number of n X 4 integer arrays with each element equal to the number of horizontal and antidiagonal neighbors equal to itself.
 * @author Georg Fischer
 */
public class A266008 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A266008() {
    super(1, "[0,1,5,5,-2]", "[1,1,-3,-3,1]");
  }
}
