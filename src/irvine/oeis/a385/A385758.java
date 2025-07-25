package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-07-11.ack/poly at 2025-07-11 21:53

import irvine.oeis.PolynomialFieldSequence;

/**
 * A385758 G.f. A(x) satisfies A(x) = 1/((1 - x) * (1 - x*A(x) - x^3*A''(x))).
 * @author Georg Fischer
 */
public class A385758 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A385758() {
    super(0, "[1],[1,-1]", "1,p1,1,A,<1,-,A,dif,dif,<3,-,*,/");
  }
}
