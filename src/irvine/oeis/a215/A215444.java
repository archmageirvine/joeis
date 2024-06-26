package irvine.oeis.a215;
// Generated by gen_seq4.pl 2024-05-11/filnum at 2024-05-11 21:20

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A215444 Numbers k such that 7^k + k^7 + 1 is prime.
 * @author Georg Fischer
 */
public class A215444 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A215444() {
    super(1, 0, n -> Z.SEVEN.pow(n).add(Z.valueOf(n).pow(7)).add(1).isProbablePrime());
  }
}
