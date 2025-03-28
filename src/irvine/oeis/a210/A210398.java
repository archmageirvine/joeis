package irvine.oeis.a210;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A210398 Number of (n+1) X 3 0..3 arrays with every 2 X 2 subblock having one or three distinct values, and new values 0..3 introduced in row major order.
 * @author Georg Fischer
 */
public class A210398 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A210398() {
    super(1, "[0,59,-336,56,1400,-1344]", "[1,-28,123,20,-500,384]");
  }
}
