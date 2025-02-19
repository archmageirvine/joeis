package irvine.oeis.a381;
// Generated by gen_seq4.pl 2025-02-18.ack/polyx at 2025-02-18 23:09

import irvine.oeis.PolynomialFieldSequence;

/**
 * A381146 E.g.f. A(x) satisfies A(x) = exp( x * cos(x * A(x)) ).
 * A(x) = exp(x * cos(x * A(x))).
 * @author Georg Fischer
 */
public class A381146 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A381146() {
    super(0, "[[1]]", ",A,<1,cos,<1,exp", 0, 1);
  }
}
