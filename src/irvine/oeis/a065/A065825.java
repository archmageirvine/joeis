package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A065825 Smallest k such that n numbers may be picked in <code>{1,</code>...,k} with no three terms in arithmetic progression.
 * @author Sean A. Irvine
 */
public class A065825 implements Sequence {

  private int mN = 0;
  private int mMin = 1;

  private void search(final boolean[] included, final int[] excluded, final int count, final int lastIndex) {
    if (count == mN) {
      if (lastIndex < mMin) {
        mMin = lastIndex;
      }
    }
    if (lastIndex + mN - count >= mMin) {
      return; // Will never beat current best
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
    mMin = 2 * mMin; // This gives enough headroom between adjacent entries
    search(new boolean[mMin], new int[mMin], 0, 0);
    return Z.valueOf(mMin);
  }
}

