package irvine.oeis.a354;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A354326 Expansion of e.g.f. 1/(1 - x/8 * (exp(4 * x) - 1)).
 * E.g.f.: <code>1/(1-x/8*(exp(4*x)-1))</code>.
 * @author Georg Fischer
 */
public class A354326 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A354326() {
    super(0, "[1],[0,4]", "1,1,x,8,/,p1,exp,1,-,*,-,/", 0, 1);
  }
}
