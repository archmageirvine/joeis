package irvine.oeis.a360;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A360446 Expansion of e.g.f. 1/(1 - log(1 + log(1+x))).
 * E.g.f.: <code>1/(1-log(1+log(1+x)))</code>.
 * @author Georg Fischer
 */
public class A360446 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A360446() {
    super(0, "[1],[1,1]", "1,1,1,p1,log,+,log,-,/", 0, 1);
  }
}
