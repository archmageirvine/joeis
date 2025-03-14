package irvine.oeis.a266;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A266050 Number of n X 3 integer arrays with each element equal to the number of horizontal and antidiagonal neighbors less than or equal to itself.
 * @author Georg Fischer
 */
public class A266050 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A266050() {
    super(1, "[0,2,8,-8,-6]", "[1,-2,-2,2,2]");
  }
}
