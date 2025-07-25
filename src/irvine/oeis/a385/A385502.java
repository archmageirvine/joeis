package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-07-03.ack/polyx at 2025-07-03 22:12

import irvine.oeis.PolynomialFieldSequence;

/**
 * A385502 E.g.f. A(x) satisfies A(x) = exp( arctanh(x * A(x)) / A(x) ).
 * @author Georg Fischer
 */
public class A385502 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A385502() {
    super(0, "[1]", "A,<1,atanh,A,/,exp", 0, 1);
  }
}
