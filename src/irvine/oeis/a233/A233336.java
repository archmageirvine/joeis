package irvine.oeis.a233;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A233336 E.g.f. A(x) satisfies: A( Integral 1/A(x)^2 dx ) = exp(x).
 * exp(rev(int(1/A(x)^2)))
 * @author Georg Fischer
 */
public class A233336 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A233336() {
    super(0, "[[1]]", ";1;A;^2;/;int;rev;exp", 0, 1);
  }
}
