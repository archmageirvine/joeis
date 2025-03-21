package irvine.oeis.a210;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A210089 Number of (n+1) X 3 0..2 arrays containing all values 0..2 with every 2 X 2 subblock having one or two distinct values, and new values 0..2 introduced in row major order.
 * @author Georg Fischer
 */
public class A210089 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A210089() {
    super(1, "[0,9,-11,-2,80,-106,16]", "[1,-20,112,-122,-61,106,-16]");
  }
}
