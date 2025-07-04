package irvine.oeis.a194;
// Generated by gen_seq4.pl 2025-07-01.ack/polyx at 2025-07-01 16:42

import irvine.oeis.PolynomialFieldSequence;

/**
 * A194786 E.g.f. satisfies: A(x) = 1 + x*A(x)^A(x).
 * @author Georg Fischer
 */
public class A194786 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A194786() {
    super(0, "[1]", "1,A,A,pow,<1,+", 0, 1);
  }
}
