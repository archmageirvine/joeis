package irvine.oeis.a089;
// Generated by gen_seq4.pl 2024-09-26.ack/filnum at 2024-09-26 23:06

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A089241 Even numbers k such that k/2 - 1 is prime.
 * @author Georg Fischer
 */
public class A089241 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A089241() {
    super(1, 1, k -> (k & 1) == 0 && Z.valueOf(k / 2).subtract(1).isProbablePrime());
  }
}
