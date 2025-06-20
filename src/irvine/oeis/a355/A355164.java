package irvine.oeis.a355;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A355164 a(n) = exp(-1/3) * Sum_{k&gt;=0} (3*k + 2)^n / (3^k * k!).
 * E.g.f.: <code>exp(2*x+(exp(3*x)-1)/3)</code>.
 * @author Georg Fischer
 */
public class A355164 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A355164() {
    super(0, "[1],[0,3]", "2,x,*,p1,exp,1,-,3,/,+,exp", 0, 1);
  }
}
