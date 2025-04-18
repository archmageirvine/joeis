package irvine.oeis.a141;
// Generated by gen_seq4.pl 2025-02-14.ack/polyx at 2025-02-14 22:55

import irvine.oeis.PolynomialFieldSequence;

/**
 * A141140 G.f. satisfies: A(A(x)) = A(x) + A(x^2).
 * x+subst(A,x,serreverse(A)^2))
 * @author Georg Fischer
 */
public class A141140 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A141140() {
    super(1, "[0,1,1]", ";x;A;rev;^2;sub;+", 0, 0);
  }
}
