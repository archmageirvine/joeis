package irvine.oeis.a302;
// Generated by gen_seq4.pl 2025-07-01.ack/polyx at 2025-07-01 16:42

import irvine.oeis.PolynomialFieldSequence;

/**
 * A302923 Raw half-moments of a Fibonacci-geometric probability distribution.
 * @author Georg Fischer
 */
public class A302923 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A302923() {
    super(1, "[1]", "x,exp,^2,4,2,x,exp,*,-,x,exp,^2,-,/,2,/", 0, 1);
  }
}
