package irvine.oeis.a240;
// Generated by gen_seq4.pl 2025-01-27.ack/poly at 2025-01-27 21:28

import irvine.oeis.PolynomialFieldSequence;

/**
 * A240999 G.f. satisfies: A(x)^2 = x + A(x*A(x)^3).
 * G.f.satisfies: A(x)^2 = x + A(x*A(x)^3).
 * @author Georg Fischer
 */
public class A240999 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A240999() {
    super(0, "[[1],[0,1]]", ",p1,A,^3,<1,sub,+,A,/");
  }
}
