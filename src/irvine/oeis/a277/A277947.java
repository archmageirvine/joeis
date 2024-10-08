package irvine.oeis.a277;
// Generated by gen_seq4.pl 2024-09-29.ack/filter at 2024-09-29 22:15

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000290;

/**
 * A277947 Squares whose largest decimal digit is 3.
 * @author Georg Fischer
 */
public class A277947 extends FilterSequence {

  /** Construct the sequence. */
  public A277947() {
    super(1, new A000290(), v -> Functions.DIGIT_MAX.i(v) == 3);
  }
}
