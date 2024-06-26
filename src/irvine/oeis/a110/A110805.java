package irvine.oeis.a110;
// Generated by gen_seq4.pl 2024-04-24/lambdan at 2024-04-24 18:19

import irvine.math.function.Functions;
import irvine.oeis.LambdaSequence;

/**
 * A110805 Sum of digits of n times number of digits of n.
 * @author Georg Fischer
 */
public class A110805 extends LambdaSequence {

  /** Construct the sequence. */
  public A110805() {
    super(1, n -> Functions.DIGIT_SUM.z(n).multiply(Functions.DIGIT_LENGTH.z(n)));
  }
}
