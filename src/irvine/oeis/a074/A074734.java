package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074734 T(n,k)= count of differences between standard sort and 'modular sort' over all subsets of k integers chosen from n. Modular Sort considers the integers 1..n to lie on a circle and rotates them to exclude the largest interval.
 * @author Sean A. Irvine
 */
public class A074734 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private long mCount = 0;

  private static boolean isSorted(final int[] list) {
    for (int k = 1; k < list.length; ++k) {
      if (list[k] < list[k - 1]) {
        return false;
      }
    }
    return true;
  }

  private void countRecursive(final int n, final int k, final int start, final int[] current, final int pos) {
    if (pos == k) {
      final int[] modSorted = modSort(current, n);
      if (!isSorted(modSorted)) {
        ++mCount;
      }
      return;
    }
    for (int j = start; j <= n; ++j) {
      current[pos] = j;
      countRecursive(n, k, j + 1, current, pos + 1);
    }
  }

  private void count(final int n, final int k) {
    countRecursive(n, k, 1, new int[k], 0);
  }

  private int[] modSort(final int[] lst, final int n) {
    // Find maximum modular differences between consecutive elements
    int maxDiff = 0;
    int maxDiffPos = 0;
    for (int k = 1; k < lst.length; ++k) {
      int modDiff = (lst[k] - lst[k - 1]) % n;
      if (modDiff > maxDiff) {
        maxDiff = modDiff;
        maxDiffPos = k;
      }
    }
    // Also need to handle the wraparound case
    int modDiff = (lst[0] + n - lst[lst.length - 1]) % n;
    if (modDiff >= maxDiff) {
      maxDiffPos = 0;
    }

    // Rotate the list based on the maximum index
    final int[] rotatedList = new int[lst.length];
    for (int k = 0, j = maxDiffPos; k < rotatedList.length; ++k, ++j) {
      if (j >= lst.length) {
        j = 0;
      }
      rotatedList[k] = lst[j];
    }
    return rotatedList;
  }

  private Z t(final int n, final int k) {
    mCount = 0;
    count(n, k);
    return Z.valueOf(mCount);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
