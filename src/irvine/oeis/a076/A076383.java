package irvine.oeis.a076;
// Generated by gen_seq4.pl 2024-01-07/filamb at 2024-01-10 22:05

import irvine.math.function.Functions;
import irvine.oeis.FilterLambdaSequence;

/**
 * A076383 Numbers n such that sum of digits in base 5 is a divisor of sum of prime divisors (A008472).
 * @author Georg Fischer
 */
public class A076383 extends FilterLambdaSequence {

  /** Construct the sequence. */
  public A076383() {
    super(1, 2, v -> Functions.SOPF.z(v).mod(Functions.DIGIT_SUM.z(5, v)).isZero());
  }
}
