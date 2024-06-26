package irvine.oeis.a227;
// Generated by gen_seq4.pl 2024-01-07/filamb at 2024-01-10 22:05

import irvine.math.function.Functions;
import irvine.oeis.FilterLambdaSequence;

/**
 * A227080 Numbers whose base-6 sum of digits is 6.
 * @author Georg Fischer
 */
public class A227080 extends FilterLambdaSequence {

  /** Construct the sequence. */
  public A227080() {
    super(1, 0, v -> Functions.DIGIT_SUM.l(6, v) == 6);
  }
}
