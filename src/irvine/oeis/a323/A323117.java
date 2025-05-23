package irvine.oeis.a323;
// Generated by gen_seq4.pl 2025-02-03.ack/lambdan at 2025-02-03 18:14

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A323117 a(n) = T_{n}(n-1) where T_{n}(x) is a Chebyshev polynomial of the first kind.
 * @author Georg Fischer
 */
public class A323117 extends LambdaSequence {

  /** Construct the sequence. */
  public A323117() {
    super(0, n -> (n <= 0) ? Z.ONE : new Q(n).multiply(Rationals.SINGLETON.sum(0, n, k -> new Q(2L * n - 4).pow(k).multiply(Binomial.binomial(n + k, 2L * k)).divide(n + k))).num());
  }
}
