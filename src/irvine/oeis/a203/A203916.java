package irvine.oeis.a203;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A203916 Number of (n+2) X 3 0..1 arrays with every 3 X 3 subblock having equal diagonal elements or equal antidiagonal elements, and new values 0..1 introduced in row major order.
 * @author Georg Fischer
 */
public class A203916 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A203916() {
    super(1, "[0,112,56,224,128]", "[1,-3,0,-6,-4]");
  }
}
