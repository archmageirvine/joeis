package irvine.oeis.a070;
// Generated by gen_seq4.pl 2024-06-23/lambdan at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A070940 Number of digits that must be counted from left to right to reach the last 1 in the binary representation of n.
 * @author Georg Fischer
 */
public class A070940 extends LambdaSequence {

  /** Construct the sequence. */
  public A070940() {
    super(1, n -> Functions.DIGIT_LENGTH.z(2, Functions.MAKE_ODD.z(n)));
  }
}
