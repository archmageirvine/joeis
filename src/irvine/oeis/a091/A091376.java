package irvine.oeis.a091;
// Generated by gen_seq4.pl 2024-05-27/filnum at 2024-05-28 02:23

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A091376 Numbers k with property that the number of prime factors of k (counted with repetition) equals the smallest prime factor of k.
 * @author Georg Fischer
 */
public class A091376 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A091376() {
    super(1, 1, k -> Functions.BIG_OMEGA.z(k).equals(Functions.LPF.z(k)));
  }
}
