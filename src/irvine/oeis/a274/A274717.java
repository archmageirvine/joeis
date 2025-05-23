package irvine.oeis.a274;
// Generated by gen_seq4.pl 2025-05-02.ack/polyx at 2025-05-02 12:03

import irvine.oeis.PolynomialFieldSequence;

/**
 * A274717 G.f. satisfies: A(x) = A(x^2) + sqrt( A(x^2) ), where A(x) = Sum_{n&gt;=1} a(n) * x^n / 2^A274716(n).
 * @author Georg Fischer
 */
public class A274717 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A274717() {
    super(1, "[[0,1],[0,0,1]]", ",p1,sub,p1,sub,sqrt,+", 2, 0);
  }
}
