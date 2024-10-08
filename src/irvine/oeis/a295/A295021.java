package irvine.oeis.a295;
// Generated by gen_seq4.pl 2024-09-29.ack/filter at 2024-09-29 22:15

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000578;

/**
 * A295021 Cubes whose largest digit is 6.
 * @author Georg Fischer
 */
public class A295021 extends FilterSequence {

  /** Construct the sequence. */
  public A295021() {
    super(1, new A000578(), v -> Functions.DIGIT_MAX.i(v) == 6);
  }
}
