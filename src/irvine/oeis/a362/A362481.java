package irvine.oeis.a362;
// Generated by gen_seq4.pl 2025-04-09.ack/polyx at 2025-04-09 21:37

import irvine.oeis.PolynomialFieldSequence;

/**
 * A362481 E.g.f. satisfies A(x) = exp(x - x^3 * A(x)^3).
 * E.g.f.satisfies A(x) = exp(x - x^3 * A(x)^3).
 * @author Georg Fischer
 */
public class A362481 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A362481() {
    super(0, "[[1]]", ",x,A,^3,<3,-,exp", 0, 1);
  }
}
