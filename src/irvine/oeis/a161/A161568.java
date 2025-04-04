package irvine.oeis.a161;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A161568 E.g.f. satisfies: A(x) = exp(2*x*exp(3*x*A(x))).
 * exp(2*x*exp(3*x*A(x)))
 * @author Georg Fischer
 */
public class A161568 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A161568() {
    super(0, "[[1]]", ";2;x;*;3;x;*;A;*;exp;*;exp", 0, 1);
  }
}
