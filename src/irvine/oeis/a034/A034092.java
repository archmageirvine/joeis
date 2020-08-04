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
    final int[] c = new int[3 * max() - 2];
    for (int k = 1; k <= max(); ++k) {
      for (int j = k + 1; j <= max(); ++j) {
        for (int i = j + 1; i <= max(); ++i) {
          ++c[k + j + i];
        }
      }
    }
    return c;
  }

  protected int max() {
    return 39;
  }

  @Override
  public Z next() {
    if (mN == mC.length) {
      return Z.ZERO;
    }
    return Z.valueOf(mC[mN++]);
  }
}

