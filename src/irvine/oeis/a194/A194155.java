package irvine.oeis.a194;
// Generated by gen_seq4.pl 2024-12-09.ack/filprof at 2024-12-09 23:32

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A194155 Primes of the form k^8 + (k+1)^8.
 * @author Georg Fischer
 */
public class A194155 extends FilterSequence {

  /** Construct the sequence. */
  public A194155() {
    super(1, new LambdaSequence(1, k -> Z.valueOf(k).pow(8).add(Z.valueOf(k + 1).pow(8))), PRIME);
  }
}
