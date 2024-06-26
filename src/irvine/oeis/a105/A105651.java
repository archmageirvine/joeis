package irvine.oeis.a105;
// Generated by gen_seq4.pl 2024-05-27/filnum at 2024-05-28 02:23

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A105651 Numbers n such that n + smallest prime factor of n + largest prime factor of n = next prime after n.
 * @author Georg Fischer
 */
public class A105651 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A105651() {
    super(1, 1, k -> Functions.LPF.z(k).add(Functions.GPF.z(k)).add(k).equals(Functions.NEXT_PRIME.z(k)));
  }
}
