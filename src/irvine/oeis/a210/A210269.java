package irvine.oeis.a210;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A210269 Half the number of (n+1) X 2 0..2 arrays with every 2 X 2 subblock having two or three distinct clockwise edge differences.
 * @author Georg Fischer
 */
public class A210269 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A210269() {
    super(1, "[0,35,-7,-54]", "[1,-8,0,12]");
  }
}
