package irvine.oeis.a206;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A206404 E.g.f. A(x) satisfies: exp(-A(x)) = exp(-A(x)^2) - x, with A(0) = 0.
 * E.g.f.: <code>reverse(exp(-x^2)-exp(-x))</code>.
 * @author Georg Fischer
 */
public class A206404 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A206404() {
    super(1, "[1],[0,-1]", "0,x,^2,-,exp,p1,exp,-,rev", 0, 1);
  }
}
