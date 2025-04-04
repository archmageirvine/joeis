package irvine.oeis.a099;
// Generated by gen_seq4.pl 2025-03-28.ack/filnum at 2025-03-28 22:47

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A099102 Natural numbers n with fewer digits than sigma(n).
 * @author Georg Fischer
 */
public class A099102 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A099102() {
    super(1, 1, k -> Functions.DIGIT_LENGTH.i(k) < Functions.DIGIT_LENGTH.i(Functions.SIGMA1.z(k)));
  }
}
