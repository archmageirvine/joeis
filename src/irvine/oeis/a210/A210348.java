package irvine.oeis.a210;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A210348 1/4 of the number of (n+1) X 2 0..3 arrays with every 2 X 2 subblock having one, two or three distinct clockwise edge differences.
 * @author Georg Fischer
 */
public class A210348 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A210348() {
    super(1, "[0,40,-129,-219,444,540]", "[1,-14,30,66,-104,-136]");
  }
}
