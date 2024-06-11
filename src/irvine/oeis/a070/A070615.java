package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A070566.
 * @author Sean A. Irvine
 */
public class A070615 extends AbstractSequence {

  private static final long LIMIT = 9999999999L;
  private long mN = 9;

  /** Construct the sequence. */
  public A070615() {
    super(10);
  }

  @Override
  public Z next() {
    if (mN >= LIMIT) {
      return Z.ZERO;
    }
    final int[] cnts = ZUtils.digitCounts(++mN);
    for (final int cnt : cnts) {
      if (cnt > 1) {
        return Z.ZERO;
      }
    }
    int min = 10;
    for (int k = 1; k < cnts.length; ++k) {
      if (cnts[k] > 0) {
        for (int j = 0; j < k; ++j) {
          if (cnts[j] > 0 && k - j < min) {
            min = k - j;
          }
        }
      }
    }
    return Z.valueOf(min);
  }
}

