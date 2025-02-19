package irvine.oeis.a212;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A212380 G.f. satisfies: A(x) = x^2 + A(A(x))/x.
 * x^2+A(A(x))/x
 * @author Georg Fischer
 */
public class A212380 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A212380() {
    super(2, "[[0, 0, 1, 1]]", ";x;^2;A;sub;x;/;+", 1, 0);
  }
}
