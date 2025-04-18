package irvine.oeis.a374;
// Generated by gen_seq4.pl 2025-03-16.ack/lambdan at 2025-03-16 17:02

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A374608 a(n) is the denominator of (1134*n^3 + 2097*n^2 + 1188*n + 193)/(10368*n^4 + 20736*n^3 + 14112*n^2 + 3744*n + 320).
 * @author Georg Fischer
 */
public class A374608 extends LambdaSequence {

  /** Construct the sequence. */
  public A374608() {
    super(0, n -> new Q(Z.valueOf(n).pow(3).multiply(1134).add(Z.valueOf(n).square().multiply(2097)).add(1188 * n + 193), Z.valueOf(n).pow(4).multiply(10368).add(Z.valueOf(n).pow(3).multiply(20736)).add(Z.valueOf(n).square().multiply(14112)).add(3744 * n + 320)).den());
  }
}
