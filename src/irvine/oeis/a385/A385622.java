package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-07-08.ack/poly at 2025-07-08 21:48

import irvine.oeis.PolynomialFieldSequence;

/**
 * A385622 G.f. A(x) satisfies A(x) = 1/( 1 - x*(A(x) + A(3*x))/2 ).
 * @author Georg Fischer
 */
public class A385622 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A385622() {
    super(0, "[1],[0, 3]", "1, 1,A,p1,sub,+,<1, 2,/,-,/");
  }
}
