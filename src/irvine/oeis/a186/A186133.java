package irvine.oeis.a186;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A186133 Number of (n+1) X 2 0..2 arrays with no 2 X 2 subblock trace equal to any horizontal or vertical neighbor 2 X 2 subblock trace.
 * @author Georg Fischer
 */
public class A186133 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A186133() {
    super(1, "[0,81,315,270]", "[1,-3,-24,-24]");
  }
}
