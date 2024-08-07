package irvine.oeis.a370;
// Generated by gen_seq4.pl 2024-05-09/filnum at 2024-05-09 22:36

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A370663 Numbers k such that (9^k + 9*k)/9 is prime.
 * @author Georg Fischer
 */
public class A370663 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A370663() {
    super(1, 1, k -> Z.NINE.pow(k).add(9L * k).divide(9).isProbablePrime());
  }
}
