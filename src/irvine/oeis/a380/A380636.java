package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-02-16.ack/polyx at 2025-02-16 22:50

import irvine.oeis.PolynomialFieldSequence;

/**
 * A380636 Expansion of e.g.f. exp(x*C(2*x)^2) where C(x) = 1 + x*C(x)^2 is the g.f. of the Catalan numbers, A000108.
 * exp(x*((1-sqrt(1-8*x))/(4*x))^2)
 * @author Georg Fischer
 */
public class A380636 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A380636() {
    super(0, "[[1]]", ";x;1;1;8;x;*;-;sqrt;-;4;x;*;/;^2;*;exp", 0, 1);
  }
}
