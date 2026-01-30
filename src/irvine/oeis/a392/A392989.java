package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicIntArray;

/**
 * A083468.
 * @author Sean A. Irvine
 */
public class A392989 extends Sequence1 {

  private final StringBuilder mS = new StringBuilder();
  private final DynamicIntArray mPositions = new DynamicIntArray();
  private int mN = 0;
  private int mK = 0;

  @Override
  public Z next() {
    final String pattern = String.valueOf(++mN);
    while (mS.indexOf(pattern, mPositions.get(mN)) < 0) {
      for (int j = 0; j < 100; ++j) { // Add 100 new numbers (simply to avoid doing this too often)
        mS.append(++mK);
      }
    }

    // Calculate the number of comparisons made by naive string search
    long comparisons = 0;
    int k = -1; // position in mS
    while (true) {
      ++k;
      int j = 0;
      while (j < pattern.length()) {
        ++comparisons;
        if (mS.charAt(k + j) == pattern.charAt(j)) {
          ++j;
        } else {
          break;
        }
      }
      if (j >= pattern.length()) {
        return Z.valueOf(comparisons);
      }
    }

  }
}
