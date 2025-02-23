package irvine.oeis.a186;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A186842 Number of (n+1) X 2 binary arrays with no 2 X 2 subblock diagonal sum less antidiagonal sum equal to any horizontal or vertical neighbor 2 X 2 subblock diagonal sum less antidiagonal sum.
 * @author Georg Fischer
 */
public class A186842 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A186842() {
    super(1, "[0,16,34,64,40]", "[1,-1,-3,-10,-8]");
  }
}
