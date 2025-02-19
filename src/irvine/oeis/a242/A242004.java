package irvine.oeis.a242;
// Generated by gen_seq4.pl 2025-01-27.ack/poly at 2025-01-27 21:28

import irvine.oeis.PolynomialFieldSequence;

/**
 * A242004 G.f. satisfies: 2*A(x) = 1 + x + A(x*A(x)^2).
 * G.f.satisfies: 2*A(x) = 1 + x + A(x*A(x)^2).
 * @author Georg Fischer
 */
public class A242004 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A242004() {
    super(0, "[[1,1]]", ",p0,A,^2,<1,sub,+,A,-");
  }
}
