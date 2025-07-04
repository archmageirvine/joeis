package irvine.oeis.a117;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A117271 Column 0 of triangle A117270, which is the matrix log of triangle A117269.
 * E.g.f.: <code>log((3-sqrt(5-4*exp(x)))/2)</code>.
 * @author Georg Fischer
 */
public class A117271 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A117271() {
    super(0, "[1]", "3,5,4,x,exp,*,-,sqrt,-,2,/,log", 0, 1);
  }
}
