package irvine.oeis.a160;
// Generated by gen_seq4.pl 2025-03-16.ack/lambdan at 2025-03-16 17:02

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A160144 Numerator of (2*n+1)/(2^(2*n+1)-1).
 * @author Georg Fischer
 */
public class A160144 extends LambdaSequence {

  /** Construct the sequence. */
  public A160144() {
    super(0, n -> new Q(2 * n + 1, Z.TWO.pow(2 * n + 1).subtract(1)).num());
  }
}
