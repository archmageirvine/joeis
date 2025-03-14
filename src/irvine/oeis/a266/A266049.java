package irvine.oeis.a266;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A266049 Number of n X 2 integer arrays with each element equal to the number of horizontal and antidiagonal neighbors less than or equal to itself.
 * @author Georg Fischer
 */
public class A266049 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A266049() {
    super(1, "[0,3,-2,-7,1]", "[1,-3,-7,-7,1]");
  }
}
