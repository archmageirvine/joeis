package irvine.oeis.a090;
// Generated by gen_seq4.pl 2025-05-29.ack/poly at 2025-05-29 22:38

import irvine.oeis.PolynomialFieldSequence;

/**
 * A090355 G.f. satisfies A^4 = BINOMIAL(A)^3.
 * A(x)^4 = A(x/(1-x))^3/(1-x)^3.
 * @author Georg Fischer
 */
public class A090355 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A090355() {
    super(0, "[1],[1,-1]", "x,p1,/,sub,^3,p1,^3,/,A,^3,/");
  }
}
