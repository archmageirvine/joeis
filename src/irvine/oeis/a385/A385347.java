package irvine.oeis.a385;
// Generated by gen_seq4.pl 2025-07-01.ack/polyx at 2025-07-01 16:42

import irvine.oeis.PolynomialFieldSequence;

/**
 * A385347 Expansion of e.g.f. 1/(1 - 3 * arcsin(x)).
 * 1/(1 - 3 * arcsin(x)).
 * @author Georg Fischer
 */
public class A385347 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A385347() {
    super(0, "[1]", "1,1,3,x,asin,*,-,/", 0, 1);
  }
}
