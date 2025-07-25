package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-06-29/poly at 2025-06-29 23:14

import irvine.oeis.PolynomialFieldSequence;

/**
 * A385014 G.f. A(x) satisfies A(x) = 1 + x*A(x)/A(-x*A(x))^2.
 * @author Georg Fischer
 */
public class A385014 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A385014() {
    super(0, "[1],[0,-1]", "1,A,<1,p1,A,*,sub,^2,/,+");
  }
}
