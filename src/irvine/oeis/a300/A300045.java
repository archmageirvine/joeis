package irvine.oeis.a300;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A300045 E.g.f. A(x) satisfies: A(x) = 1 + Integral A(4*x)^(1/2) dx.
 * 1+int(A(4*x)^(1/2))
 * @author Georg Fischer
 */
public class A300045 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A300045() {
    super(0, "[[1]]", ";1;4;x;*;sub;^1/2;int;+", 0, 1);
  }
}
