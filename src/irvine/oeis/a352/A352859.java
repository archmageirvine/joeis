package irvine.oeis.a352;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A352859 a(0) = 1; a(n) = Sum_{k=0..n-1} binomial(n,k+1) * 2^k * a(k).
 * 1+x*A(2*x/(1-x))/(1-x)^2
 * @author Georg Fischer
 */
public class A352859 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A352859() {
    super(0, "[[1]]", ";1;x;2;x;*;1;x;-;/;sub;*;1;x;-;^2;/;+", 0, 0);
  }
}
