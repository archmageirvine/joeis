package irvine.oeis.a245;
// Generated by gen_seq4.pl 2024-01-07/simtraf at 2024-01-10 22:05

import irvine.math.function.Functions;
import irvine.oeis.a024.A024658;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A245346 Sum of digits of n in fractional base 10/3.
 * @author Georg Fischer
 */
public class A245346 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A245346() {
    super(0, new A024658(), v -> Functions.DIGIT_SUM.z(v));
  }
}
