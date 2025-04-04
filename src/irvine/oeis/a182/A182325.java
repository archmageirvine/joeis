package irvine.oeis.a182;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A182325 G.f. satisfies: A(x) = ( A(x^2) + x*A(x) )^2.
 * (A(x^2)+x*A(x))^2
 * @author Georg Fischer
 */
public class A182325 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A182325() {
    super(0, "[[1]]", ";x;^2;sub;x;A;*;+;2;^", 0, 0);
  }
}
