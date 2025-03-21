package irvine.oeis.a229;
// Generated by gen_seq4.pl 2025-02-14.ack/polyx at 2025-02-14 22:55

import irvine.oeis.PolynomialFieldSequence;

/**
 * A229811 G.f. A(x) satisfies: A(x) = x + B(x)*C(x), where B(x) = x + 2*C(x)*A(x) and C(x) = x + 3*B(x)*A(x).
 * x+x^2*(1+2*A)*(1+3*A)/(1-6*A^2)^2)
 * @author Georg Fischer
 */
public class A229811 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A229811() {
    super(1, "[0,1]", ";x;x;^2;1;2;A;*;+;*;1;3;A;*;+;*;1;6;A;^2;*;-;^2;/;+", 0, 0);
  }
}
