package irvine.oeis.a307;
// Generated by gen_seq4.pl 2023-10-12/lambdan at 2023-10-12 23:13

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A307485 A permutation of the nonnegative integers: one odd, two even, four odd, eight even, etc.; extended to nonnegative integer with a(0) = 0.
 * @author Georg Fischer
 */
public class A307485 extends LambdaSequence {

  /** Construct the sequence. */
  public A307485() {
    super(0, n -> Z.valueOf(2L * n - (1L << IntegerUtils.floorLog2(4 * n + 1)) / 3));
  }
}
