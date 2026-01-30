package irvine.oeis.a390;

import java.util.Arrays;

import irvine.oeis.a392.A392989;

/**
 * A083468.
 * @author Sean A. Irvine
 */
public class A390503 extends A392989 {

  @Override
  protected long countComparisons(final String pattern) {
    final int length = pattern.length();

    // Initialize Boyer-Moore shifting arrays
    int j = length + 1;
    final int[] f = new int[j];
    final int[] goodShift = new int[j];
    f[length] = j;
    for (int i = length; i > 0; --i) {
      while (j <= length && pattern.charAt(i - 1) != pattern.charAt(j - 1)) {
        if (goodShift[j] == 0) {
          goodShift[j] = j - i;
        }
        j = f[j];
      }
      f[i - 1] = --j;
    }
    int p = f[0];
    for (j = 0; j <= length; ++j) {
      if (goodShift[j] == 0) {
        goodShift[j] = p;
      }
      if (j == p) {
        p = f[p];
      }
    }

    // We need only support digits for our purposes, hence array of size 10
    final int[] badShift = new int[10];
    Arrays.fill(badShift, length);
    for (int k = 0; k < length - 1; ++k) {
      badShift[pattern.charAt(k) - '0'] = length - k - 1;
    }

    // Boyer-Moore search, counting number of comparisons
    long comparisons = 0;
    int offset = 0;
    while (true) { // We will always eventually find a match
      j = length - 1;
      while (j >= 0) {
        ++comparisons;
        if (pattern.charAt(j) != champernowne(offset + j)) {
          break;
        }
        --j;
      }
      if (j < 0) {
        return comparisons;
      }
      offset += Math.max(goodShift[j + 1], badShift[champernowne(offset + j) - '0'] - length + j + 1);
    }
  }
}
