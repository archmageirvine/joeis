package irvine.oeis.a276;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A276359 E.g.f. A(x) satisfies: A( x*exp(x)*cosh(x) ) = x*exp(2*x).
 * E.g.f.: <code>reverse((2*x+lambertw(2*x))/4)</code>.
 * @author Georg Fischer
 */
public class A276359 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A276359() {
    super(1, "[1],[0,2]", "2,x,*,p1,lambertW,+,4,/,rev", 0, 1);
  }
}
