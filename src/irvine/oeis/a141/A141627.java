package irvine.oeis.a141;
// Generated by gen_seq4.pl 2025-04-28.ack/polyx at 2025-04-28 23:36

import irvine.oeis.PolynomialFieldSequence;

/**
 * A141627 E.g.f. satisfies: A(x) = exp(x*A(sin(x)*x)).
 * @author Georg Fischer
 */
public class A141627 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A141627() {
    super(0, "[[1]]", ",x,sin,<1,sub,<1,exp", 0, 1);
  }
}
