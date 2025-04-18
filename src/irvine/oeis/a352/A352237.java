package irvine.oeis.a352;
// Generated by gen_seq4.pl 2025-01-25.ack/poly at 2025-01-25 22:44

import irvine.oeis.PolynomialFieldSequence;

/**
 * A352237 G.f. A(x) satisfies: A(x) = 1 + x*A(x)^2 / (A(x) - 3*x*A'(x)).
 * G.f.A(x) satisfies: A(x) = 1 + x*A(x)^2 / (A(x) - 3*x*A'(x)).
 * @author Georg Fischer
 */
public class A352237 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A352237() {
    super(0, "[[1],[1,-1]]", ",p0,A,^2,<1,A,A,dif,<1,3,*,-,/,+");
  }
}
