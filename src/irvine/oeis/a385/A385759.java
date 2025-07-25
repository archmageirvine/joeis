package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-07-11.ack/poly at 2025-07-11 21:53

import irvine.oeis.PolynomialFieldSequence;

/**
 * A385759 G.f. A(x) satisfies A(x) = 1/((1 - x) * (1 - x*A(x) - x^4*A'''(x))).
 * @author Georg Fischer
 */
public class A385759 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A385759() {
    super(0, "[1],[1,-1]", "1,p1,1,A,<1,-,A,dif,dif,dif,<4,-,*,/");
  }
}
