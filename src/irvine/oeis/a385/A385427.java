package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-07-01.ack/polyx at 2025-07-01 16:42

import irvine.oeis.PolynomialFieldSequence;

/**
 * A385427 E.g.f. A(x) satisfies A(x) = exp( arcsin(x * A(x)) / A(x) ).
 * E.g.f.A(x) satisfies A(x) = exp(arcsin(x * A(x)) / A(x)).
 * @author Georg Fischer
 */
public class A385427 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A385427() {
    super(0, "[1]", "A,<1,asin,A,/,exp", 0, 1);
  }
}
