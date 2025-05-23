package irvine.oeis.a252;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A252253 Number of (n+2) X (7+2) 0..3 arrays with every 3 X 3 subblock row and column sum not equal to 0 3 5 6 or 7 and every 3 X 3 diagonal and antidiagonal sum equal to 0 3 5 6 or 7.
 * @author Georg Fischer
 */
public class A252253 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A252253() {
    super(1, "[0,847,-410,-71,-2523,1260,252,841,-422,-86]", "[1,-1,0,-3,3,0,1,-1]");
  }
}
