package irvine.oeis.a341;
// Generated by gen_seq4.pl 2024-06-23/lambdan at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a059.A059893;

/**
 * A341915 For any nonnegative number n with runs in binary expansion (r_1, ..., r_w), a(n) = Sum_{k = 1..w} 2^(r_1 + ... + r_k - 1).
 * @author Georg Fischer
 */
public class A341915 extends LambdaSequence {

  private static final DirectSequence A059893 = new A059893();

  /** Construct the sequence. */
  public A341915() {
    super(0, n -> A059893.a(Functions.GRAY_ENCODE.z(n)));
  }
}
