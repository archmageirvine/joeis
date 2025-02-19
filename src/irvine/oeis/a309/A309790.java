package irvine.oeis.a309;
// Generated by gen_seq4.pl 2025-01-27.ack/poly at 2025-01-27 21:28

import irvine.oeis.PolynomialFieldSequence;

/**
 * A309790 G.f. A(x) satisfies: A(x) = 2*x*(1 - x)*A(x^2) + x/(1 - x).
 * G.f.A(x) satisfies: A(x) = 2*x*(1 - x)*A(x^2) + x/(1 - x).
 * @author Georg Fischer
 */
public class A309790 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A309790() {
    super(0, "[[1],[0,0,1],[1,-1]]", ",p2,<1,2,*,p1,sub,*,x,p2,/,+");
  }
}
