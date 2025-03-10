package irvine.oeis.a252;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A252133 Number of (n+2) X (2+2) 0..3 arrays with every 3 X 3 subblock row, column, diagonal and antidiagonal sum not equal to 0 3 4 6 or 7.
 * @author Georg Fischer
 */
public class A252133 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A252133() {
    super(1, "[0,134,-112,-15,-371,-124,143,225,75,-13,-64,-4]", "[1,-2,-1,-4,1,4,3,0,-1,-1]");
  }
}
