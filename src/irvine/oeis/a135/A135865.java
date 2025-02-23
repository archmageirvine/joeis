package irvine.oeis.a135;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A135865 G.f. A(x) satisfies: A(x) = 1 + x*A(4x)^(1/2).
 * 1+x*A(4x)^(1/2)
 * @author Georg Fischer
 */
public class A135865 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A135865() {
    super(0, "[[1]]", ";1;x;4;x;*;sub;^1/2;*;+", 0, 0);
  }
}
