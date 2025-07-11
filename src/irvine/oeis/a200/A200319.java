package irvine.oeis.a200;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A200319 E.g.f. satisfies: A(x) = x-1 + exp(A(x)^2).
 * E.g.f.: <code>reverse(1+x-exp(x^2))</code>.
 * @author Georg Fischer
 */
public class A200319 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A200319() {
    super(1, "[1]", "1,x,+,x,^2,exp,-,rev", 0, 1);
  }
}
