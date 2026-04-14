package irvine.oeis.a393;

import irvine.math.z.ZUtils;
import irvine.oeis.FilterNumberSequence;

/**
 * A393803 allocated for Vincenzo Manto.
 * @author Sean A. Irvine
 */
public class A393803 extends FilterNumberSequence {

  private static int cnt(final long n, final int b) {
    final int[] cnts = ZUtils.digitCounts(n, b);
    int s = 0;
    for (int k = 1; k < cnts.length; ++k) {
      s += cnts[k];
    }
    return s;
  }

  /** Construct the sequence. */
  public A393803() {
    super(1, 0, k -> cnt(k, 2) == cnt(k, 3));
  }
}
