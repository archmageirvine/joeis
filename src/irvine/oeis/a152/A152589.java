package irvine.oeis.a152;
// Generated by gen_seq4.pl 2025-04-30.ack/filprof at 2025-04-30 23:37

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A152589 Primes of the form 15^(2^k) + 2.
 * @author Georg Fischer
 */
public class A152589 extends FilterSequence {

  /** Construct the sequence. */
  public A152589() {
    super(1, new LambdaSequence(0, k -> Z.valueOf(15).pow(Z.TWO.pow(k)).add(2)), PRIME);
  }
}
