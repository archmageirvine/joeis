package irvine.oeis.a394;

import irvine.math.z.ZUtils;
import irvine.oeis.FilterNumberSequence;

/**
 * A394775 allocated for John Mason.
 * @author Sean A. Irvine
 */
public class A394775 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A394775() {
    super(1, 0, k -> {
      final int[] cnts = ZUtils.digitCounts(k);
      for (int j = 1; j < cnts.length; ++j) {
        if (cnts[j] > cnts[j - 1]) {
          return false;
        }
      }
      return true;
    });
  }
}
