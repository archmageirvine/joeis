package irvine.oeis.a326;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A326829 G.f. A(x) satisfies: A(x) = 1 - x * (1 - A(x/(1 + x)) / (1 + x)).
 * 1-x+int((exp(-x)*A(x)))
 * @author Georg Fischer
 */
public class A326829 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A326829() {
    super(0, "[[1]]", ";1;x;-;0;x;-;exp;A;*;int;+", 0, 1);
  }
}
