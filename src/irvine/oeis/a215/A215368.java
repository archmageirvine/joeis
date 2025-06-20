package irvine.oeis.a215;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A215368 E.g.f.: Series_Reversion( x*cos(x) - x*sin(x) ).
 * E.g.f.: <code>reverse(x*cos(x)-x*sin(x))</code>.
 * @author Georg Fischer
 */
public class A215368 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A215368() {
    super(1, "[1]", "x,x,cos,*,x,x,sin,*,-,rev", 0, 1);
  }
}
