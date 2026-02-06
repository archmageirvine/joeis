package irvine.oeis.a393;

import irvine.oeis.a392.A392989;

/**
 * A393101 Number of character comparisons needed by Knuth-Morris-Pratt string search to identify the first occurrence of string n in the infinite Champernowne word 123456789101112... (A033307).
 * @author Sean A. Irvine
 */
public class A393101 extends A392989 {

  @Override
  protected long countComparisons(final String pattern) {
    // Initialise Knuth-Morris-Pratt shifts
    final int length = pattern.length();
    int i = 1;
    int j = 0;
    final int[] shift = new int[length + 1];
    shift[0] = -1;
    while (i < length) {
      if (pattern.charAt(i) == pattern.charAt(j)) {
        shift[i] = shift[j];
      } else {
        shift[i] = j;
        while (j >= 0 && pattern.charAt(i) != pattern.charAt(j)) {
          j = shift[j];
        }
      }
      ++i;
      ++j;
    }
    shift[i] = j;

    // Matching
    long comparisons = 0;
    int shiftIndex = 0;
    int offset = 0;
    while (true) {
      while (shiftIndex > -1) {
        ++comparisons;
        if (pattern.charAt(shiftIndex) == champernowne(offset)) {
          break;
        }
        shiftIndex = shift[shiftIndex];
      }
      ++offset;
      ++shiftIndex;
      if (shiftIndex >= length) {
        return comparisons;
      }
    }
  }
}
