package irvine.oeis.a355;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A355163 a(n) = exp(-1) * Sum_{k&gt;=0} (4*k + 3)^n / k!.
 * E.g.f.: <code>exp(exp(4*x)+3x-1)</code>.
 * @author Georg Fischer
 */
public class A355163 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A355163() {
    super(0, "[1],[0,4]", "p1,exp,3,x,*,+,1,-,exp", 0, 1);
  }
}
