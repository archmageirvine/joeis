package irvine.oeis.a354;
// Generated by gen_seq4.pl 2025-06-10.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A354412 Expansion of e.g.f. 1/(2 - exp(x))^(x/2).
 * E.g.f.: <code>1/(2-exp(x))^(x/2)</code>.
 * @author Georg Fischer
 */
public class A354412 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A354412() {
    super(0, "[1],[0,1/2]", "1,2,x,exp,-,p1,pow,/", 0, 1);
  }
}
