package irvine.oeis.a349;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A349103 Expansion of e.g.f. exp( (sin(x) + x*cos(x))/2 ).
 * E.g.f.: <code>exp((sin(x)+x*cos(x))/2)</code>.
 * @author Georg Fischer
 */
public class A349103 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A349103() {
    super(0, "[1]", "x,sin,x,x,cos,*,+,2,/,exp", 0, 1);
  }
}
