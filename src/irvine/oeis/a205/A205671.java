package irvine.oeis.a205;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A205671 E.g.f.  A(x) = Sum_{n&gt;0} a(n)*x^n/n! is the inverse function to exp(2*x)-x-1.
 * E.g.f.: <code>reverse(-1+exp(2*x)-x)</code>.
 * @author Georg Fischer
 */
public class A205671 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A205671() {
    super(1, "[1],[0,2]", "0,1,-,p1,exp,+,x,-,rev", 0, 1);
  }
}
