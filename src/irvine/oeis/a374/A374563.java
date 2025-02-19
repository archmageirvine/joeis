package irvine.oeis.a374;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A374563 Expansion of g.f. A(x) satisfying A(x) = x*(1 + A(x)^2) + x^2*(1 + A(x)^2)^2.
 * rev((sqrt(1+4*x)-1)/(2*(1+x^2)))
 * @author Georg Fischer
 */
public class A374563 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A374563() {
    super(1, "[[1]]", ";1;4;x;*;+;sqrt;1;-;2;1;x;^2;+;*;/;rev", 0, 0);
  }
}
