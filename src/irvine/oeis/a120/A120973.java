package irvine.oeis.a120;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A120973 G.f. A(x) satisfies A(x) = 1 + x*A(x)^3 * A(x*A(x)^3)^3.
 * 1+x*A(x)^3*(A(x*A(x)^3))^3
 * @author Georg Fischer
 */
public class A120973 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A120973() {
    super(0, "[[1]]", ";1;x;A;^3;*;x;A;^3;*;sub;^3;*;+", 0, 0);
  }
}
