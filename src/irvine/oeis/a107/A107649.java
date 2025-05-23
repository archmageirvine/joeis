package irvine.oeis.a107;
// Generated by gen_seq4.pl 2025-02-02.ack/filprim at 2025-02-02 21:39

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A107649 Numbers n such that (10^(2n+1)+72*10^n-1)/9 is prime.
 * @author Georg Fischer
 */
public class A107649 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A107649() {
    super(1, 0, k -> Z.TEN.pow(2L * k + 1).add(Z.valueOf(72).multiply(Z.TEN.pow(k)).subtract(1)).divide(9).isProbablePrime());
  }
}
