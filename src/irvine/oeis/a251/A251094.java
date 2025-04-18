package irvine.oeis.a251;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A251094 Number of (n+1) X (2+1) 0..1 arrays with no 2 X 2 subblock having its minimum diagonal element less than its minimum antidiagonal element.
 * @author Georg Fischer
 */
public class A251094 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A251094() {
    super(1, "[0,41,-75,76,-24]", "[1,-7,11,-10,3]");
  }
}
