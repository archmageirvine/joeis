package irvine.oeis.a136;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A136659 Unsigned third column (k=2) of triangle A136656 divided by 4.
 * E.g.f.: <code>(2+6*x-3*x^2)/(2*(1-x)^6)</code>.
 * @author Georg Fischer
 */
public class A136659 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A136659() {
    super(0, "[1],[1,-1]", "2,6,x,*,+,3,x,^2,*,-,2,p1,^6,*,/", 0, 1);
  }
}
