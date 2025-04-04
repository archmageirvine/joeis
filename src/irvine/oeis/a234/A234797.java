package irvine.oeis.a234;
// Generated by gen_seq4.pl 2025-02-14.ack/polyx at 2025-02-14 22:55

import irvine.oeis.PolynomialFieldSequence;

/**
 * A234797 E.g.f. satisfies: A'(x) = 1 + A(x) + 2*A(x)^2, where A(0)=0.
 * intformal(1+A+2*A^2))
 * @author Georg Fischer
 */
public class A234797 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A234797() {
    super(1, "[0,1]", ";1;A;+;2;A;^2;*;+;int", 0, 1);
  }
}
