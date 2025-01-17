package irvine.oeis.a379;
// Generated by gen_seq4.pl 2024-12-30.ack/filnum at 2024-12-30 19:33

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A379269 Numbers whose binary representation has exactly three zeros.
 * @author Georg Fischer
 */
public class A379269 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A379269() {
    super(1, 0, n -> Functions.DIGIT_LENGTH.i(2, n) - Functions.DIGIT_SUM.i(2, n) == 3);
  }
}
