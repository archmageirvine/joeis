package irvine.oeis.a275;
// Generated by gen_seq4.pl 2025-01-27.ack/polyz at 2025-01-27 21:28

import irvine.oeis.PolynomialFieldSequence;

/**
 * A275758 G.f. satisfies: A(x) = x + A( A(x)^4 - A(x)^10 ).
 * G.f.satisfies: A(x) = x + A(A(x)^4 - A(x)^10).
 * @author Georg Fischer
 */
public class A275758 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A275758() {
    super(1, "[[0,1]]", ",p0,A,^4,A,^10,-,sub,+", 0, 0, 1, 3);
  }
}
