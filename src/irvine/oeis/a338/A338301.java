package irvine.oeis.a338;
// Generated by gen_seq4.pl 2025-02-20.ack/poly at 2025-02-20 23:05

import irvine.oeis.PolynomialFieldSequence;

/**
 * A338301 O.g.f. satisfies: A(x) = 1/(1 - x - x*( d/dx x^2*A(x)' )).
 * @author Georg Fischer
 */
public class A338301 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A338301() {
    super(0, "[[1],[1,-1]]", ", 1,p1,A,dif,<2,dif,<1,-,/");
  }
}
