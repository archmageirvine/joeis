package irvine.oeis.a227;
// Generated by gen_seq4.pl 2024-01-07/filamb at 2024-01-10 22:05

import irvine.math.function.Functions;
import irvine.oeis.FilterLambdaSequence;

/**
 * A227062 Numbers whose base-5 sum of digits is 5.
 * @author Georg Fischer
 */
public class A227062 extends FilterLambdaSequence {

  /** Construct the sequence. */
  public A227062() {
    super(1, 0, v -> Functions.DIGIT_SUM.l(5, v) == 5);
  }
}
