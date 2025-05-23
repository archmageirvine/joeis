package irvine.oeis.a263;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A263334 Number of (n+2) X (1+2) 0..2 arrays with each row and column divisible by 13, read as a base-3 number with top and left being the most significant digits.
 * @author Georg Fischer
 */
public class A263334 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A263334() {
    super(1, "[0,3,-2,-2,-3]", "[1,-3,0,-1,3]");
  }
}
