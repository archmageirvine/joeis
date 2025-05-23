package irvine.oeis.a195;
// Generated by gen_seq4.pl 2025-04-28.ack/filprof at 2025-04-28 23:36

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A195813 Primes of the form 3^n - 2^n + n^2 - n^3.
 * @author Georg Fischer
 */
public class A195813 extends FilterSequence {

  /** Construct the sequence. */
  public A195813() {
    super(1, new LambdaSequence(0, k -> Z.THREE.pow(k).subtract(Z.TWO.pow(k)).add(Z.valueOf(1 - k).multiply(k).multiply(k))), PRIME);
  }
}
