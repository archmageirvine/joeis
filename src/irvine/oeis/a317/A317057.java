package irvine.oeis.a317;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A317057 a(n) is the number of time-dependent assembly trees satisfying the connected gluing rule for a cycle on n vertices.
 * E.g.f.: <code>(x-x*exp(x)+exp(x)-1)/(2-exp(x))</code>.
 * @author Georg Fischer
 */
public class A317057 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A317057() {
    super(1, "[1]", "x,x,x,exp,*,-,x,exp,+,1,-,2,x,exp,-,/", 0, 1);
  }
}
