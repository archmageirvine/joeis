package irvine.oeis.a357;
// Generated by gen_seq4.pl 2025-06-09.ack/polyex

import irvine.oeis.PolynomialFieldSequence;

/**
 * A357599 Expansion of e.g.f. sinh(2 * log(1+x)) / 2.
 * E.g.f.: <code>sinh(2*log(1+x))/2</code>.
 * @author Georg Fischer
 */
public class A357599 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A357599() {
    super(0, "[1],[1,1]", "2,p1,log,*,sinh,2,/", 0, 1);
  }
}
