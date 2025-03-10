package irvine.oeis.a203;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A203651 1/25 the number of (n+1) X 4 0..4 arrays with every 2 X 2 subblock having equal diagonal elements or equal antidiagonal elements.
 * @author Georg Fischer
 */
public class A203651 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A203651() {
    super(1, "[0,729,-4748,2400]", "[1,-45,204,-96]");
  }
}
