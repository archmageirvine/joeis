package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-06-10.ack/poly at 2025-06-10 21:36

import irvine.oeis.PolynomialFieldSequence;

/**
 * A384574 G.f. A(x) satisfies A(x) = 1 + x * A(x*A(x)^4).
 * @author Georg Fischer
 */
public class A384574 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A384574() {
    super(0, "[1]", "1,A,^4,<1,sub,<1,+");
  }
}
