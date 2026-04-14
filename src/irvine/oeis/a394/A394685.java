package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394685: Number of convex subsets of {1,...,n} under divisibility.
 * @author Sean A. Irvine
 */
public class A394685 extends Sequence1 {

  private int mN = 0;

  private boolean isConvex(final long mask, final int n) {
    for (int x = 1; x <= n; ++x) {
      if ((mask & (1L << (x - 1))) == 0) {
        continue;
      }
      for (int y = x + 1; y <= n; ++y) {
        if ((mask & (1L << (y - 1))) == 0) {
          continue;
        }
        if (y % x == 0) {
          // check for z with x | z | y but z not in set
          for (int z = 1; z <= n; ++z) {
            if ((mask & (1L << (z - 1))) != 0) {
              continue;
            }
            if (z % x == 0 && y % z == 0) {
              return false;
            }
          }
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    final long total = 1L << mN;
    long count = 0;
    for (long mask = 0; mask < total; ++mask) {
      if (isConvex(mask, mN)) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}

