package irvine.oeis.a091;
// Generated by gen_seq4.pl 2024-05-27/filnum at 2024-05-28 02:23

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A091375 Numbers k with property that the number of prime factors of k (counted with repetition) exceeds the smallest prime factor of k.
 * @author Georg Fischer
 */
public class A091375 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A091375() {
    super(1, 1, k -> Functions.BIG_OMEGA.z(k).compareTo(Functions.LPF.z(k)) > 0);
  }
}
