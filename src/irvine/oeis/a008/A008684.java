package irvine.oeis.a008;

import irvine.oeis.FiniteSequence;

/**
 * A008684.
 * @author Sean A. Irvine
 */
public class A008684 extends FiniteSequence {

  private static final int[] MONTH_COUNTS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  private static long[] buildDays() {
    final long[] res = new long[365];
    int k = 0;
    for (final int m : MONTH_COUNTS) {
      for (int i = 1; i <= m; ++i) {
        res[k++] = i;
      }
    }
    return res;
  }

  /** Construct the sequence. */
  public A008684() {
    super(buildDays());
  }
}
