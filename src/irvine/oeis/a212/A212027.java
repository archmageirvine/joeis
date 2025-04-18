package irvine.oeis.a212;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A212027 G.f. satisfies: A(x) = x + x*A(x) * A(A(A(x))) / A(A(x)).
 * x+x*A(x)*A(A(A(x)))/A(A(x))
 * @author Georg Fischer
 */
public class A212027 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A212027() {
    super(1, "[[0, 1]]", ";x;x;A;*;A;sub;sub;*;A;sub;/;+", 0, 0);
  }
}
