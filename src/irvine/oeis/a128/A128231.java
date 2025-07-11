package irvine.oeis.a128;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A128231 Expansion of exp(x)/(1 - x^3/3!), where a(n) = 1 + binomial(n,3)*a(n-3).
 * E.g.f.: <code>exp(x)/(1-x^3/6)</code>.
 * @author Georg Fischer
 */
public class A128231 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A128231() {
    super(0, "[1]", "x,exp,1,x,^3,6,/,-,/", 0, 1);
  }
}
