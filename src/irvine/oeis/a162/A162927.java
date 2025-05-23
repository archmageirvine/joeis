package irvine.oeis.a162;
// Generated by gen_seq4.pl 2025-04-30.ack/filprof at 2025-04-30 23:37

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A162927 Primes of the form n^n-2.
 * @author Georg Fischer
 */
public class A162927 extends FilterSequence {

  /** Construct the sequence. */
  public A162927() {
    super(1, new LambdaSequence(0, k -> Z.valueOf(k).pow(k).subtract(2)), PRIME);
  }
}
