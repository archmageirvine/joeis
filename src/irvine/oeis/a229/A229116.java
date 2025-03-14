package irvine.oeis.a229;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A229116 G.f.: A(x) = exp( Sum_{n&gt;=1} A((-1)^n*x)^n * x^n/n ).
 * 1/(2*A(-x)*(1-x*A(-x)))+A(-x)*(1+x*A(-x))/2
 * @author Georg Fischer
 */
public class A229116 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A229116() {
    super(0, "[[1]]", ";1;2;0;x;-;sub;*;1;x;0;x;-;sub;*;-;*;/;0;x;-;sub;1;x;0;x;-;sub;*;+;*;2;/;+", 0, 0);
  }
}
