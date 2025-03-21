package irvine.oeis.a186;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A186120 Number of (n+1) X 2 binary arrays with every 2 X 2 subblock diagonal sum less antidiagonal sum equal to some horizontal or vertical neighbor 2 X 2 subblock diagonal sum less antidiagonal sum.
 * @author Georg Fischer
 */
public class A186120 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A186120() {
    super(1, "[0,0,14,-24,-4,8,-16]", "[1,-3,0,6,-6,4]");
  }
}
