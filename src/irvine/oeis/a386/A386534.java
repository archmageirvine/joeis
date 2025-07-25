package irvine.oeis.a386;
// Generated by gen_seq4.pl 2025-07-26.ack/polyx at 2025-07-26 21:09

import irvine.oeis.PolynomialFieldSequence;

/**
 * A386534 E.g.f. A(x) satisfies A(x) = exp(x * A(x) + x^5/120 * A&apos;&apos;&apos;&apos;(x)).
 * @author Georg Fischer
 */
public class A386534 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A386534() {
    super(0, "[1]", "A,<1,A,dif,dif,dif,dif,120,/,<5,+,exp", 0, 1);
  }
}
