package irvine.oeis.a161;
// Generated by gen_seq4.pl 2025-04-28.ack/polyx at 2025-04-28 23:36

import irvine.oeis.PolynomialFieldSequence;

/**
 * A161567 E.g.f. satisfies: A(x) = exp(x*exp(x*A(x)^2)).
 * @author Georg Fischer
 */
public class A161567 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A161567() {
    super(0, "[[1]", ",A,^2,<1,exp,<1,exp", 0, 1);
  }
}
