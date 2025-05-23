package irvine.oeis.a376;
// Generated by gen_seq4.pl 2025-04-28.ack/filprof at 2025-04-28 23:36

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.LambdaSequence;

/**
 * A376895 Primes of the form 3^k*k^3 + 2.
 * @author Georg Fischer
 */
public class A376895 extends FilterSequence {

  /** Construct the sequence. */
  public A376895() {
    super(1, new LambdaSequence(0, k -> Z.THREE.pow(k).multiply(Z.valueOf(k).pow(3)).add(2)), PRIME);
  }
}
