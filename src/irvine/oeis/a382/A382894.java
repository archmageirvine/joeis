package irvine.oeis.a382;
// Generated by gen_seq4.pl 2025-04-15.ack/poly at 2025-04-15 19:24

import irvine.oeis.PolynomialFieldSequence;

/**
 * A382894 G.f. A(x) satisfies A(x) = 1/( 1 - x * (1+x)^3 * A(x) )^2.
 * @author Georg Fischer
 */
public class A382894 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A382894() {
    super(0, "[[1],[1, 3, 3, 1]]", ", 1,p1,<1,A,^3/2,*,+,^2");
  }
}
