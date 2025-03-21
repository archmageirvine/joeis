package irvine.oeis.a350;
// Generated by gen_seq4.pl 2025-02-16.ack/polyx at 2025-02-16 22:50

import irvine.oeis.PolynomialFieldSequence;

/**
 * A350971 Expansion of e.g.f.: (sec(x)*tan(x))^2*(1+sin(x)).
 * (sec(x)*tan(x))^2*(1+sin(x))
 * @author Georg Fischer
 */
public class A350971 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A350971() {
    super(0, "[[1]]", ";x;sec;x;tan;*;^2;1;x;sin;+;*", 0, 1);
  }
}
