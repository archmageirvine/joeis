package irvine.oeis.a277;
// Generated by gen_seq4.pl 2025-04-28.ack/polyx at 2025-04-28 23:36

import irvine.oeis.PolynomialFieldSequence;

/**
 * A277500 E.g.f.: -LambertW(-tan(x)).
 * E.g.f.: -LambertW(-tan(x)).
 * @author Georg Fischer
 */
public class A277500 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A277500() {
    super(0, "[[1]", ",x,tan,neg,lambertW,neg", 0, 1);
  }
}
