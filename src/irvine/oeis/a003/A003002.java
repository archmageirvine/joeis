package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003002 Size of the largest subset of the numbers [1...n] which does not contain a 3-term arithmetic progression.
 * @author Sean A. Irvine
 */
public class A003002 extends Sequence0 {

  private int mN = -1;
  private int mMax = 0;

  private void search(final boolean[] included, final int[] excluded, final int count, final int lastIndex) {
    if (count > mMax) {
      mMax = count;
    }
    final int c = count + 1;
    for (int p = lastIndex + 1; p < excluded.length; ++p) {
      if (excluded[p] == 0) {
        // Mark excluded entries arising from using p
        included[p] = true;
        for (int k = 1; k < p && k < excluded.length; ++k) {
          if (included[k]) {
            final int j = 2 * p - k;
            if (j < excluded.length && excluded[j] == 0) {
              excluded[j] = c;
            }
          }
        }
        // Recursively search
        search(included, excluded, c, p);
        // Restore excluded entries arising from using p
        included[p] = false;
        for (int k = 1; k < excluded.length; ++k) {
          if (excluded[k] == c) {
            excluded[k] = 0;
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mMax = 0;
    search(new boolean[mN + 1], new int[mN + 1], 0, 0);
    return Z.valueOf(mMax);
  }
}

