package irvine.oeis.a368;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A368634 Expansion of g.f. A(x) satisfying A(x) = 1 + x*(3*A(x)^2 - A(-x)^2)/2.
 * 1+x*(3*A(x)^2-A(-x)^2)/2
 * @author Georg Fischer
 */
public class A368634 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A368634() {
    super(0, "[[1]]", ";1;x;3;A;^2;*;0;x;-;sub;^2;-;*;2;/;+", 0, 0);
  }
}
