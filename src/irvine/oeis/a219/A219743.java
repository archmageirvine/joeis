package irvine.oeis.a219;
// Generated by gen_seq4.pl 2024-01-07/filamb at 2024-01-10 22:05

import irvine.math.function.Functions;
import irvine.oeis.FilterLambdaSequence;

/**
 * A219743 Number for which the number of distinct base 10 digits is 8.
 * @author Georg Fischer
 */
public class A219743 extends FilterLambdaSequence {

  /** Construct the sequence. */
  public A219743() {
    super(1, 0, v -> Functions.DISTINCT_DIGIT_COUNT.i(10, v) == 8);
  }
}
