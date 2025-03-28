package irvine.oeis.a234;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A234029 Number of (n+1) X (1+1) 0..4 arrays with every 2 X 2 subblock having the absolute values of all six edge and diagonal differences no larger than 1.
 * @author Georg Fischer
 */
public class A234029 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A234029() {
    super(1, "[0,61,-120,-240,-78]", "[1,-7,6,18,6]");
  }
}
