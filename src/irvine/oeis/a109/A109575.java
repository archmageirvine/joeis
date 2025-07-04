package irvine.oeis.a109;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A109575 E.g.f.: x/(1 + 12*x - 8*x^3) = x/[1-Hermite(3,x)].
 * E.g.f.: <code>x/(1+12*x-8*x^3)</code>.
 * @author Georg Fischer
 */
public class A109575 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A109575() {
    super(0, "[1]", "x,1,12,x,*,+,8,x,^3,*,-,/", 0, 1);
  }
}
