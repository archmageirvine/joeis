package irvine.oeis.a171;
// Generated by gen_seq4.pl 2025-01-25.ack/poly at 2025-01-25 22:44

import irvine.oeis.PolynomialFieldSequence;

/**
 * A171204 G.f. A(x) satisfies A(x) = 1 + x*A(2*x)^5.
 * G.f.satisfies A(x) = 1 + x*A(2*x)^5.
 * @author Georg Fischer
 */
public class A171204 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A171204() {
    super(0, "[[0],[1],[0,2]]", ",p1,p2,sub,^5,<1,+");
  }
}
