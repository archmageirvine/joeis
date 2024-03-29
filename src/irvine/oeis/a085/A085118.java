package irvine.oeis.a085;
// Generated by gen_seq4.pl 2023-10-12/simtraf at 2023-10-12 23:13

import irvine.math.z.Z;
import irvine.oeis.a001.A001751;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A085118 Primes together with twice the odd primes.
 * @author Georg Fischer
 */
public class A085118 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A085118() {
    super(1, new A001751().skip(1), (k, v) -> (k <= 2) ? Z.valueOf(k + 1) : v);
  }
}
