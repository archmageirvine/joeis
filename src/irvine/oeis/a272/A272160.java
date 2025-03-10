package irvine.oeis.a272;
// Generated by gen_seq4.pl 2024-12-15.ack/filprof at 2024-12-15 23:09

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A272160 Primes of the form abs(8n^2 - 488n + 7243) in order of increasing nonnegative values of n.
 * @author Georg Fischer
 */
public class A272160 extends FilterSequence {

  /** Construct the sequence. */
  public A272160() {
    super(1, new LambdaSequence(0, k -> Z.valueOf(8L * k - 488).multiply(k).add(7243).abs()), PRIME);
  }
}
