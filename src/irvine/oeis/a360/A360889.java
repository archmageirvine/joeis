package irvine.oeis.a360;
// Generated by gen_seq4.pl 2025-01-27.ack/poly at 2025-01-27 21:28

import irvine.oeis.PolynomialFieldSequence;

/**
 * A360889 G.f. satisfies A(x) = 1 + x * (1 + x^3)^2 * A(x * (1 + x^3)).
 * G.f.satisfies A(x) = 1 + x * (1 + x^3)^2 * A(x * (1 + x^3)).
 * @author Georg Fischer
 */
public class A360889 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A360889() {
    super(0, "[[1],[1,0,0,1]]", ",p0,p1,^2,p1,<1,sub,<1,*,+");
  }
}
