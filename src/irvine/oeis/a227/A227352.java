package irvine.oeis.a227;
// Generated by gen_seq4.pl 2024-12-04.ack/lambdan at 2024-12-04 22:12

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a048.A048680;

/**
 * A227352 Permutation of nonnegative integers: map each number by lengths of runs in its binary representation to the number in whose once left-shifted Zeckendorf representation occurs the same run lengths (in the same order) as the lengths of consecutive blocks of zeros.
 * @author Georg Fischer
 */
public class A227352 extends LambdaSequence {

  private static final DirectSequence A048680 = new A048680();

  /** Construct the sequence. */
  public A227352() {
    super(0, n -> A048680.a(Functions.GRAY_ENCODE.z(n)));
  }
}
