package irvine.oeis.a250;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A250834 Number of (n+1) X (1+1) 0..2 arrays with no 2 X 2 subblock having a diagonal absolute difference less than its antidiagonal absolute difference.
 * @author Georg Fischer
 */
public class A250834 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A250834() {
    super(1, "[0,55,-107,62,-54]", "[1,-8,13,-8,6]");
  }
}
