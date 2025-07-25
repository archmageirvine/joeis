package irvine.oeis.a247;
// Generated by gen_seq4.pl 2025-07-11.ack/polyxa at 2025-07-11 21:53

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a292.A292460;

/**
 * A247471 Number of paths in B(n) that start with a u step and end with a d step.
 * new A292460(), new A000045()
 * @author Georg Fischer
 */
public class A247471 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A247471() {
    super(0, "[1],[0,0,1,-1,-1]", "x,B,x,C,-,x,C,^2,/,<2,p1,-", 2, 0, 1, 1, new A292460(), new A000045());
  }
}
