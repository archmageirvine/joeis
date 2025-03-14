package irvine.oeis.a161;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A161971 E.g.f. satisfies: A(x) = exp( x*exp( x*A'(x) ) ), where A'(x) = d/dx A(x).
 * exp(x*exp(x*dif(A(x))))
 * @author Georg Fischer
 */
public class A161971 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A161971() {
    super(0, "[[1]]", ";x;x;A;dif;*;exp;*;exp", 0, 1);
  }
}
