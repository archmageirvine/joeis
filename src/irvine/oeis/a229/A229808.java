package irvine.oeis.a229;
// Generated by gen_seq4.pl 2025-02-14.ack/polyx at 2025-02-14 22:55

import irvine.oeis.PolynomialFieldSequence;

/**
 * A229808 G.f. A(x) satisfies: A(x) = x + 2*B(x)*C(x), where B(x) = x + 3*A(x)*C(x) and C(x) = x + 5*A(x)*B(x).
 * x+2*x^2*(1+3*A)*(1+5*A)/(1-15*A^2)^2)
 * @author Georg Fischer
 */
public class A229808 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A229808() {
    super(1, "[0,1]", ";x;2;x;^2;*;1;3;A;*;+;*;1;5;A;*;+;*;1;15;A;^2;*;-;^2;/;+", 0, 0);
  }
}
