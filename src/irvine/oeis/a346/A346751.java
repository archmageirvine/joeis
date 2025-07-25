package irvine.oeis.a346;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A346751 Expansion of e.g.f. log( 1 + x^3 * exp(x) / 3! ).
 * E.g.f.: <code>log(1+x^3*exp(x)/6)</code>.
 * @author Georg Fischer
 */
public class A346751 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A346751() {
    super(0, "[1]", "1,x,^3,x,exp,*,6,/,+,log", 0, 1);
  }
}
