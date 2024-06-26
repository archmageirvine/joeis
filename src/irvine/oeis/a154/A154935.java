package irvine.oeis.a154;
// Generated by gen_seq4.pl 2024-05-11/filnum at 2024-05-11 21:20

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A154935 Numbers n such that n^7-2 is prime.
 * @author Georg Fischer
 */
public class A154935 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A154935() {
    super(1, 0, n -> Z.valueOf(n).pow(7).subtract(2).isProbablePrime());
  }
}
