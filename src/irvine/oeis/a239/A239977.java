package irvine.oeis.a239;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A239977 a(n) = -Sum_{k=0..n} binomial(n, k)*A226158(k).
 * E.g.f.: <code>2*x*exp(2*x)/(1+exp(x))</code>.
 * @author Georg Fischer
 */
public class A239977 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A239977() {
    super(0, "[1],[0,2]", "2,x,*,p1,exp,*,1,x,exp,+,/", 0, 1);
  }
}
