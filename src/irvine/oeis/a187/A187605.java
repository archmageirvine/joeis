package irvine.oeis.a187;
// Generated by gen_seq4.pl 2024-12-08.ack/filprof at 2024-12-08 22:31

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A187605 Primes of the form k^k + k - 1.
 * @author Georg Fischer
 */
public class A187605 extends FilterSequence {

  /** Construct the sequence. */
  public A187605() {
    super(1, new LambdaSequence(1, k -> Z.valueOf(k).pow(k).add(k - 1)), PRIME);
  }
}
