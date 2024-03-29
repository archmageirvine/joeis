package irvine.oeis.a072;
// Generated by gen_seq4.pl 2024-01-07/filamb at 2024-01-10 22:05

import irvine.math.z.ZUtils;
import irvine.oeis.FilterLambdaSequence;

/**
 * A072601 Numbers which in base 2 have at least as many 1's as 0's.
 * @author Georg Fischer
 */
public class A072601 extends FilterLambdaSequence {

  /** Construct the sequence. */
  public A072601() {
    super(1, 1, v -> {
      final int[] c = ZUtils.digitCounts(v, 2);
      return c[0] <= c[1];
    });
  }
}
