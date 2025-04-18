package irvine.oeis.a213;
// Generated by gen_seq4.pl 2025-02-13.ack/polyx at 2025-02-13 23:28

import irvine.oeis.PolynomialFieldSequence;

/**
 * A213906 G.f. satisfies: A(x) = x^2/(1-x) + A(A(x)).
 * x^2/(1-x)+A(A(x))
 * @author Georg Fischer
 */
public class A213906 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A213906() {
    super(2, "[[0, 0, 1]]", ";x;^2;1;x;-;/;A;sub;+", 0, 0);
  }
}
