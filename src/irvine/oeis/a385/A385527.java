package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-07-06.ack/polyx at 2025-07-06 20:53

import irvine.oeis.PolynomialFieldSequence;

/**
 * A385527 E.g.f. A(x) satisfies A(x) = exp(x*A(4*x)).
 * @author Georg Fischer
 */
public class A385527 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A385527() {
    super(0, "[1],[0,4]", "p1,sub,<1,exp", 0, 1);
  }
}
