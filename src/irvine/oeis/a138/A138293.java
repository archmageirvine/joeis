package irvine.oeis.a138;
// Generated by gen_seq4.pl 2025-02-14.ack/polyx at 2025-02-14 22:55

import irvine.oeis.PolynomialFieldSequence;

/**
 * A138293 E.g.f. satisfies: A(x) = x + exp(x*A(x)).
 * x+exp(x*A))
 * @author Georg Fischer
 */
public class A138293 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A138293() {
    super(0, "[1]", ";x;x;A;*;exp;+", 0, 1);
  }
}
