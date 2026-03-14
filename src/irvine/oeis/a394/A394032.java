package irvine.oeis.a394;

import irvine.math.z.ZUtils;
import irvine.oeis.FilterNumberSequence;

/**
 * A394032 allocated for Ahmet efe Birinci.
 * @author Sean A. Irvine
 */
public class A394032 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A394032() {
    super(1, n -> {
      final int[] cnts = ZUtils.digitCounts(n);
      final long s = 2L * cnts[2] + 3L * cnts[3] + 5L * cnts[5] + 7L * cnts[7];
      if (s == 0 || n % s != 0) {
        return false;
      }
      if (cnts[2] > 0 && (n & 1) != 0) {
        return false;
      }
      if (cnts[3] > 0 && n % 3 != 0) {
        return false;
      }
      if (cnts[5] > 0 && n % 5 != 0) {
        return false;
      }
      if (cnts[7] > 0 && n % 7 != 0) {
        return false;
      }
      return true;
    });
  }
}

