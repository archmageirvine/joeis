package irvine.oeis.a181;
// Generated by gen_seq4.pl 2025-03-16.ack/lambdan at 2025-03-16 17:02

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A181161 Numerator in abs(binomial(-1/8,n)).
 * @author Georg Fischer
 */
public class A181161 extends LambdaSequence {

  /** Construct the sequence. */
  public A181161() {
    super(0, n -> Binomial.binomial(new Q(-1, 8), n).abs().num());
  }
}
