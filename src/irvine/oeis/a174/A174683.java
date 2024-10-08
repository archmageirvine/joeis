package irvine.oeis.a174;
// Generated by gen_seq4.pl 2024-09-16.ack/lambdan at 2024-09-16 19:36

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A174683 Denominator of 1/16 - 1/n^2.
 * @author Georg Fischer
 */
public class A174683 extends LambdaSequence {

  /** Construct the sequence. */
  public A174683() {
    super(0, n -> (n == 0) ? Z.ZERO : ((n == 4) ? Z.valueOf(16) : new Q(1, 16).subtract(new Q(Z.ONE, Z.valueOf(n).multiply(n))).den()));
  }
}
