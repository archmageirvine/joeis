package irvine.oeis.a356;
// Generated by gen_seq4.pl 2025-05-30.ack/polyz at 2025-05-30 21:48

import irvine.oeis.PolynomialFieldSequence;

/**
 * A356258 Number of 6-dimensional cubic lattice walks that start and end at origin after 2n steps, free to pass through origin at intermediate stages.
 * @author Georg Fischer
 */
public class A356258 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A356258() {
    super(0, "[1],[0,2]", "0,p1,besselI,^6", 0, 1, 0, 2);
  }
}
