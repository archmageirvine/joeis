package irvine.oeis.a252;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A252945 Number of (n+2) X (1+2) 0..2 arrays with every consecutive three elements in every row, column and nw-se diagonal having exactly two distinct values, and new values 0 upwards introduced in row major order.
 * @author Georg Fischer
 */
public class A252945 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A252945() {
    super(1, "[0,198,-441,270,54,-288,216]", "[1,-6,9,-4,-2,6,-4]");
  }
}
