package irvine.oeis.a304;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A304121 Expansion of A(x) = 1 + x + x*A(x) + x^2*A(x)^2 + x^3*A(x)^3.
 * 1+x+x*A(x)+x^2*A(x)^2+x^3*A(x)^3
 * @author Georg Fischer
 */
public class A304121 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A304121() {
    super(0, "[[1]]", ";1;x;+;x;A;*;+;x;^2;A;^2;*;+;x;^3;A;^3;*;+", 0, 0);
  }
}
