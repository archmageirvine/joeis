package irvine.oeis.a174;
// Generated by gen_seq4.pl 2025-01-27.ack/poly at 2025-01-27 21:28

import irvine.oeis.PolynomialFieldSequence;

/**
 * A174513 G.f. satisfies: A(x) = A(x^2)^2 + x*A(x^2)^4.
 * G.f.satisfies: A(x) = A(x^2)^2 + x*A(x^2)^4.
 * @author Georg Fischer
 */
public class A174513 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A174513() {
    super(0, "[[1],[0,0,1]]", ",p1,sub,^2,p1,sub,^4,<1,+");
  }
}
