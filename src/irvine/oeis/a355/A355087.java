package irvine.oeis.a355;
// Generated by gen_seq4.pl 2025-02-12.ack/polyx at 2025-02-12 23:23

import irvine.oeis.PolynomialFieldSequence;

/**
 * A355087 E.g.f. A(x) satisfies A(x) = 1 - log(1-x) * A(3*x).
 * 1-log(1-x)*A(3*x)
 * @author Georg Fischer
 */
public class A355087 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A355087() {
    super(0, "[[1]]", ";1;1;x;-;log;3;x;*;sub;*;-", 0, 1);
  }
}
