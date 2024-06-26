package irvine.oeis.a370;
// Generated by gen_seq4.pl 2024-03-26/filnum at 2024-03-26 23:22

import irvine.math.z.ZUtils;
import irvine.oeis.FilterNumberSequence;

/**
 * A370872 Positive integers m such that c(0) &gt; c(1) &gt;= c(2), where c(k) = number of k's in the ternary representation of m.
 * @author Georg Fischer
 */
public class A370872 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A370872() {
    super(1, 1, k -> {
      final int[] c = ZUtils.digitCounts(k, 3);
      return c[0] > c[1] && c[1] >= c[2];
    });
  }
}
