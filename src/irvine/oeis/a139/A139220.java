package irvine.oeis.a139;
// Generated by gen_seq4.pl 2024-05-11/filnum at 2024-05-11 21:20

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A139220 Numbers k such that 41+(k+k^2)/2 = 41+A000217(k) is prime.
 * @author Georg Fischer
 */
public class A139220 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A139220() {
    super(1, 0, n -> Z.valueOf((long) n * (n + 1) / 2 + 41).isProbablePrime());
  }
}
