package irvine.oeis.a144;
// Generated by gen_seq4.pl 2025-04-30.ack/filprof at 2025-04-30 23:37

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A144131 Primes of the form T_4(n), where T_4(x) = 8x^4 - 8x^2 + 1 is the fourth Chebyshev polynomial (of the first kind).
 * @author Georg Fischer
 */
public class A144131 extends FilterSequence {

  /** Construct the sequence. */
  public A144131() {
    super(1, new LambdaSequence(0, k -> Z.valueOf(k).pow(4).subtract(Z.valueOf(k).square()).multiply(8).add(1)), PRIME);
  }
}
