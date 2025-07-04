package irvine.oeis.a276;
// Generated by gen_seq4.pl 2025-07-01.ack/polyx at 2025-07-01 16:42

import irvine.oeis.PolynomialFieldSequence;

/**
 * A276232 E.g.f. W(x)^W(x), where W(x) = LambertW(-x)/(-x) and satisfies W(x)^(1/W(x)) = exp(x).
 * @author Georg Fischer
 */
public class A276232 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A276232() {
    super(0, "[1],[0,-1]", "p1,lambertW,^2,x,/,exp", 1, 1);
  }
}
