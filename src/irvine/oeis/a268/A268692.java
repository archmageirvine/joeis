package irvine.oeis.a268;
// Generated by gen_seq4.pl 2024-09-11.ack/filnum at 2024-09-11 23:28

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A268692 Numbers k such that 2^(k-1)*(2^k - 1) + 1 is prime (see A134169).
 * @author Georg Fischer
 */
public class A268692 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A268692() {
    super(1, 1, k -> Z.TWO.pow(k - 1).multiply(Z.TWO.pow(k).subtract(1)).add(1).isProbablePrime());
  }
}
