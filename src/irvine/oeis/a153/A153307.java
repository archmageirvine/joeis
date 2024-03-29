package irvine.oeis.a153;
// Generated by gen_seq4.pl 2024-03-14g/filnum at 2024-03-14 21:15

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A153307 Numbers n such that 14*n+3 is not prime.
 * @author Georg Fischer
 */
public class A153307 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A153307() {
    super(1, 0, n -> !Z.valueOf(n).multiply(14).add(3).isProbablePrime());
  }
}
