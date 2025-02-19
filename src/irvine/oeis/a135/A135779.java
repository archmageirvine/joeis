package irvine.oeis.a135;
// Generated by gen_seq4.pl 2025-02-16.ack/filnum at 2025-02-16 22:50

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A135779 Numbers having number of divisors equal to number of digits in base 9.
 * @author Georg Fischer
 */
public class A135779 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A135779() {
    super(1, 1, k -> Functions.SIGMA0.i(k) == Z.valueOf(k).toString(9).length());
  }
}
