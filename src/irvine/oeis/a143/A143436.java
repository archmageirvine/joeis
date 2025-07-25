package irvine.oeis.a143;
// Generated by gen_seq4.pl 2025-01-25.ack/poly at 2025-01-25 22:44

import irvine.oeis.PolynomialFieldSequence;

/**
 * A143436 G.f. A(x) satisfies A(x) = 1 + x*A(x*A(x))^4.
 * G.f.satisfies: A(x) = 1 + x*A(x*A(x))^4.
 * @author Georg Fischer
 */
public class A143436 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A143436() {
    super(0, "[[1]]", ",p0,A,<1,sub,^4,<1,+");
  }
}
