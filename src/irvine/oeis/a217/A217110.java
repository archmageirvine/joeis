package irvine.oeis.a217;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A217110 Number of pandigital numbers with n places.
 * E.g.f.: <code>(9/10)*(exp(x)-1)^10</code>.
 * @author Georg Fischer
 */
public class A217110 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A217110() {
    super(1, "[1]", "9,10,/,x,exp,1,-,^10,*", 0, 1);
  }
}
