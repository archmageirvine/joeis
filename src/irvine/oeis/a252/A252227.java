package irvine.oeis.a252;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A252227 Number of (n+2) X (7+2) 0..2 arrays with every 3 X 3 subblock row and column sum 2 3 or 4 and every diagonal and antidiagonal sum not 2 3 or 4.
 * @author Georg Fischer
 */
public class A252227 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A252227() {
    super(1, "[0,9922,190058,68964,-345770,-532232,-235408,83728,79136]", "[1,-3,1,-3,-3,1,1]");
  }
}
