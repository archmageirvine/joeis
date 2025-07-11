package irvine.oeis.a384;
// Generated by gen_seq4.pl 2025-06-12.ack/polyx at 2025-06-12 21:49

import irvine.oeis.PolynomialFieldSequence;

/**
 * A384740 E.g.f. A(x) satisfies A(x) = exp( x * A(x*A(x)^3) ).
 * @author Georg Fischer
 */
public class A384740 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A384740() {
    super(0, "[1]", "A,^3,<1,sub,<1,exp", 0, 1);
  }
}
