package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicIntArray;

/**
 * A079494 Number of words of weight n in the free central groupoid on one generator.
 * @author Sean A. Irvine
 */
public class A079494 extends Sequence0 {

  // Follows description given by Knuth in the OEIS sequence.

  private static final int MAX_TERM = 100; // way more than we can do here
  private final DynamicIntArray mL = new DynamicIntArray();
  private final DynamicIntArray mR = new DynamicIntArray();
  private final int[] mFirstByWeight = new int[MAX_TERM]; // Tracks first word given weight
  private int mN = -1;
  private int mNextFreeWord = 1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mFirstByWeight[1] = 1;
      return Z.ONE; // empty word
    }
    for (int r = mN - 1, s = 0; r >= 0; --r, ++s) {
      for (int j = mFirstByWeight[s]; j < mFirstByWeight[s + 1]; ++j) {
        for (int k = mFirstByWeight[r]; k < mFirstByWeight[r + 1]; ++k) {
          // Condition (a)
          if (j > 0 && k > 0 && mR.get(j) == mL.get(k)) {
            continue;
          }
          // Condition (b)
          if (k > 0 && mL.get(k) > 0 && mL.get(mL.get(k)) == j) {
            continue;
          }
          // Condition (c)
          if (j > 0 && mR.get(j) > 0 & mR.get(mR.get(j)) == k) {
            continue;
          }
          mL.set(mNextFreeWord, j);
          mR.set(mNextFreeWord, k);
          if (++mNextFreeWord < 0) {
            throw new UnsupportedOperationException("Overflow");
          }
        }
      }
    }
    mFirstByWeight[mN + 1] = mNextFreeWord;
    return Z.valueOf(mNextFreeWord - mFirstByWeight[mN]);
  }
}
