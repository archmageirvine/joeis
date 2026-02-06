package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392989 Number of character comparisons needed by naive string search to identify the first occurrence of string n in the infinite Champernowne word 123456789101112... (A033307).
 * @author Sean A. Irvine
 */
public class A392989 extends Sequence1 {

  private final StringBuilder mS = new StringBuilder();
  private int mN = 0;
  private int mK = 0;

  protected char champernowne(final int pos) {
    while (pos >= mS.length()) {
      mS.append(++mK);
    }
    return mS.charAt(pos);
  }

  protected long countComparisons(final String pattern) {
    // Calculate the number of comparisons made by naive string search
    long comparisons = 0;
    int k = -1; // position in mS
    while (true) { // We will always eventually find a match
      ++k;
      int j = 0;
      while (j < pattern.length()) {
        ++comparisons;
        if (champernowne(k + j) == pattern.charAt(j)) {
          ++j;
        } else {
          break;
        }
      }
      if (j >= pattern.length()) {
        return comparisons;
      }
    }
  }

  @Override
  public Z next() {
    return Z.valueOf(countComparisons(String.valueOf(++mN)));
  }
}
