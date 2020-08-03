package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034092 Number of partitions of n into 3 distinct parts from <code>[ 1,39 ]</code>.
 * @author Sean A. Irvine
 */
public class A034092 implements Sequence {

  private int[] mC = count();
  private int mN = 0;

  private int[] count() {
    final int[] c = new int[39 + 38 + 37 + 1];
    for (int k = 1; k <= 39; ++k) {
      for (int j = k + 1; j <= 39; ++j) {
        for (int i = j + 1; i <= 39; ++i) {
          ++c[k + j + i];
        }
      }
    }
    return c;
  }

  @Override
  public Z next() {
    if (mN == mC.length) {
      return Z.ZERO;
    }
    return Z.valueOf(mC[mN++]);
  }
}

