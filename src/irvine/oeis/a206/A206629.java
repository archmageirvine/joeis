package irvine.oeis.a206;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A206629 Number of (n+1) X 3 0..2 arrays with every 2 X 3 or 3 X 2 subblock having no more than four equal edges, and new values 0..2 introduced in row major order.
 * @author Georg Fischer
 */
public class A206629 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A206629() {
    super(1, "[0,121,328,596,44,216]", "[1,-24,-68,-132,-8,-48]");
  }
}
