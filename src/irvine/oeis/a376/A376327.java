package irvine.oeis.a376;
// Generated by gen_seq4.pl 2025-02-14.ack/polyx at 2025-02-14 22:55

import irvine.oeis.PolynomialFieldSequence;

/**
 * A376327 Expansion of e.g.f. -LambertW(-x/(1-x^2)).
 * -lambertW(-x/(1-x^2))
 * @author Georg Fischer
 */
public class A376327 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A376327() {
    super(0, "[[1]]", ";0;0;x;1;x;^2;-;/;-;lambertW;-", 0, 1);
  }
}
