package irvine.oeis.a238;
// Generated by gen_seq4.pl 2025-02-14.ack/poly at 2025-02-14 22:55

import irvine.oeis.PolynomialFieldSequence;

/**
 * A238426 Expansion of F(x) where F(x) = 1 + x / (1 - x * F(x) * F(-x^2) ).
 * F(x) = 1 + x / (1 - x * F(x) * F(-x^2)).
 * @author Georg Fischer
 */
public class A238426 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A238426() {
    super(0, "[[1],[0,-1],[0,0,-1]]", ",1,x,1,A,<1,p2,sub,*,-,/,+");
  }
}
