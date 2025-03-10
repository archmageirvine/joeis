package irvine.oeis.a360;
// Generated by gen_seq4.pl 2025-02-20.ack/polyx at 2025-02-20 23:05

import irvine.oeis.PolynomialFieldSequence;

/**
 * A360977 G.f. satisfies: A(x) = Series_Reversion(x - x^2*A'(x)^2).
 * @author Georg Fischer
 */
public class A360977 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A360977() {
    super(1, "[[0, 1]]", ",x,A,dif,^2,<2,-,rev");
  }
}
