package irvine.oeis.a354;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A354316 Expansion of e.g.f. 1/(1 + x/3 * log(1 - 3 * x)).
 * E.g.f.: <code>1/(1+x/3*log(1-3*x))</code>.
 * @author Georg Fischer
 */
public class A354316 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A354316() {
    super(0, "[1],[1,-3]", "1,1,x,3,/,p1,log,*,+,/", 0, 1);
  }
}
