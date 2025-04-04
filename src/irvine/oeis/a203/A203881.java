package irvine.oeis.a203;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A203881 Number of (n+1) X 3 0..6 arrays with every 2 X 2 subblock having equal diagonal elements or equal antidiagonal elements.
 * @author Georg Fischer
 */
public class A203881 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A203881() {
    super(1, "[0,8281,47334]", "[1,-25,-138]");
  }
}
