package irvine.oeis.a383;
// Generated by gen_seq4.pl 2025-07-08.ack/poly at 2025-07-08 21:48

import irvine.oeis.PolynomialFieldSequence;

/**
 * A383554 G.f. B(x) satisfies B(x)^2 = B(x*B(x)) / (1 - x*B(x)).
 * @author Georg Fischer
 */
public class A383554 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A383554() {
    super(0, "[1],[1,-1]", "A,<1,sub, 1,A,<1,-,/,A,/");
  }
}
