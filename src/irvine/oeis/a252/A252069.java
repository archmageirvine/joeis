package irvine.oeis.a252;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A252069 Number of (n+2) X (2+2) 0..2 arrays with every 3 X 3 subblock row, column, diagonal and antidiagonal sum not equal to 0 3 or 4.
 * @author Georg Fischer
 */
public class A252069 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A252069() {
    super(1, "[0,105,-58,10,-275,-163,55,160,77,6,-39,-4]", "[1,-2,-1,-4,1,4,3,0,-1,-1]");
  }
}
