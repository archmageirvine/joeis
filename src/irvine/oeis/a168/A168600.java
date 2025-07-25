package irvine.oeis.a168;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A168600 E.g.f. A(x) satisfies A(x) = exp( x*A(2*x)^2 ).
 * exp(x*A(2x)^2)
 * @author Georg Fischer
 */
public class A168600 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A168600() {
    super(0, "[[1]]", ";x;2;x;*;sub;^2;*;exp", 0, 1);
  }
}
