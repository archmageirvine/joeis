package irvine.oeis.a217;
// Generated by gen_seq4.pl 2025-06-10.ack/polyez

import irvine.oeis.PolynomialFieldSequence;

/**
 * A217582 E.g.f. 1/2*sqrt(sec(2*x))-1/2, (even part).
 * E.g.f.: <code>1/2*sqrt(sec(2*x))-1/2</code>.
 * @author Georg Fischer
 */
public class A217582 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A217582() {
    super(0, "[1],[0,2]", "1,2,/,p1,sec,sqrt,*,1,2,/,-", 0, 1, 0, 2);
  }
}
