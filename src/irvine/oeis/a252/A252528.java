package irvine.oeis.a252;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A252528 Number of (n+2) X (4+2) 0..3 arrays with every 3 X 3 subblock row and diagonal sum equal to 0 2 3 6 or 7 and every 3 X 3 column and antidiagonal sum not equal to 0 2 3 6 or 7.
 * @author Georg Fischer
 */
public class A252528 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A252528() {
    super(1, "[0,719,462,626,-2086,-172]", "[1,0,0,-4]");
  }
}
