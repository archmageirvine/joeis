package irvine.oeis.a108;
// Generated by gen_seq4.pl 2025-01-03.ack/filprof at 2025-01-06 00:11

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A108562 Primes of the form prime(n) + prime(n+1) - 2n - 1.
 * @author Georg Fischer
 */
public class A108562 extends FilterSequence {

  /** Construct the sequence. */
  public A108562() {
    super(1, new LambdaSequence(1, k -> Functions.PRIME.z(k).add(Functions.PRIME.z(k + 1)).subtract(2L * k + 1)), PRIME);
  }
}
