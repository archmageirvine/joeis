package irvine.oeis.a218;
// Generated by gen_seq4.pl 2025-06-10.ack/polyx at 2025-06-10 21:36

import irvine.oeis.PolynomialFieldSequence;

/**
 * A218653 E.g.f. satisfies: A(x) = 1 + log(1 + x^2*A(x)^2)/x.
 * @author Georg Fischer
 */
public class A218653 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A218653() {
    super(0, "[1]", "1,1,A,^2,<2,+,log,x,/,+", 1, 1);
  }
}
