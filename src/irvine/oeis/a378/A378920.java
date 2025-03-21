package irvine.oeis.a378;
// Generated by gen_seq4.pl 2025-01-27.ack/poly at 2025-01-27 21:28

import irvine.oeis.PolynomialFieldSequence;

/**
 * A378920 G.f. A(x) satisfies A(x) = 1 + x*A(x)^6/(1 + x*A(x)^2).
 * G.f.A(x) satisfies A(x) = 1 + x*A(x)^6/(1 + x*A(x)^2).
 * @author Georg Fischer
 */
public class A378920 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A378920() {
    super(0, "[[1]]", ",p0,A,^6,<1,1,A,^2,<1,+,/,+");
  }
}
