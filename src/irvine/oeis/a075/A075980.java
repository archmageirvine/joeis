package irvine.oeis.a075;
// Generated by gen_seq4.pl 2025-01-03.ack/filprof at 2025-01-06 00:11

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A075980 Primes of the form | n^5-2^n |.
 * @author Georg Fischer
 */
public class A075980 extends FilterSequence {

  /** Construct the sequence. */
  public A075980() {
    super(1, new LambdaSequence(0, k -> Z.valueOf(k).pow(5).subtract(Z.TWO.pow(k)).abs()), PRIME);
  }
}
