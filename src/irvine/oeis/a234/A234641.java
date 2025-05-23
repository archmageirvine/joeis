package irvine.oeis.a234;
// Generated by gen_seq4.pl 2025-05-02.ack/filnum at 2025-05-02 12:03

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A234641 Odd numbers n such that sigma(sigma(n^2)) is odd.
 * @author Georg Fischer
 */
public class A234641 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A234641() {
    super(1, 0, n -> (n & 1) == 1 && Functions.SIGMA1.z(Functions.SIGMA1.z(Z.valueOf(n).multiply(n))).testBit(0));
  }
}
