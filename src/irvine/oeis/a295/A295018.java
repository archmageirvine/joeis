package irvine.oeis.a295;
// Generated by gen_seq4.pl 2024-09-29.ack/filter at 2024-09-29 22:15

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000290;

/**
 * A295018 Squares whose largest digit is 8.
 * @author Georg Fischer
 */
public class A295018 extends FilterSequence {

  /** Construct the sequence. */
  public A295018() {
    super(1, new A000290(), v -> Functions.DIGIT_MAX.i(v) == 8);
  }
}
