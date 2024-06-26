package irvine.oeis.a102;
// Generated by gen_seq4.pl 2024-05-11/filnum at 2024-05-11 21:20

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A102343 Numbers k such that k*10^3 + 777 is prime.
 * @author Georg Fischer
 */
public class A102343 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A102343() {
    super(1, 0, n -> Z.valueOf(n).multiply(1000).add(777).isProbablePrime());
  }
}
