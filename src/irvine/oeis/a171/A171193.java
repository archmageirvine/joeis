package irvine.oeis.a171;
// Generated by gen_seq4.pl 2025-01-25.ack/poly at 2025-01-25 22:44

import irvine.oeis.PolynomialFieldSequence;

/**
 * A171193 G.f. A(x) satisfies A(x) = 1/(1 - x*A(2*x)^3).
 * G.f.satisfies A(x) = 1/(1 - x*A(2x)^3).
 * @author Georg Fischer
 */
public class A171193 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A171193() {
    super(0, "[[1],[0,2]]", ",p0,p0,p1,sub,^3,<1,-,/");
  }
}
