package irvine.oeis.a107;
// Generated by gen_seq4.pl 2024-03-14g/filnum at 2024-03-14 21:15

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A107645 Numbers k such that the string 1311k is the decimal expansion of a prime number.
 * @author Georg Fischer
 */
public class A107645 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A107645() {
    super(1, 0, n -> new Z("1311" + n).isProbablePrime());
  }
}
