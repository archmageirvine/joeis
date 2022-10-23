package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicIntArray;

/**
 * A002004 Davenport-Schinzel numbers of degree 4 on n symbols.
 * @author Sean A. Irvine
 */
public class A002004 extends Sequence1 {

  // Davenport-Schinzel numbers
  // There are three symbols, here 0, 1, 2.
  // Want length of the longest sequence where no symbol repeats and the longest
  // SUBSEQUENCE of the form ababab... has length at most n.
  // To make the search faster, need only consider "normal" sequences (i.e. for any
  // symbols u and v, if u < v, then u occurs at least once in the sequence before v).

  private int mN = 0;
  private int mL;
  private int[] mSubsequenceCounts = null;

  // Stack of changed positions, so we can unroll them later.  This helps avoid a lot of object churn
  // because otherwise we would have to remember this in local variables at each level of the
  // recursion.
  private final DynamicIntArray mChangeList = new DynamicIntArray();

  // We use mSubsequenceCounts to keep track of repeats like aba... The index is a pair
  // of symbols (ab) and the value the count of that pairing.

  private void search(final int degree, final int symbols, final int prev, final int currentLength, final int maxUsedSymbol, final int changeListStart) {
    if (currentLength > mL) {
      mL = currentLength;
    }
    final int limit = Math.min(maxUsedSymbol + 1, symbols - 1);
    for (int symbol = 0; symbol <= limit; ++symbol) {
      if (symbol != prev) {
        int sp = changeListStart;
        boolean ok = true;
        final int end = (symbol + 1) * symbols;
        for (int index = symbol * symbols; index < end; ++index) {
          if (mSubsequenceCounts[index] >= 0) {
            mChangeList.set(sp++, index);
            mSubsequenceCounts[index] = -mSubsequenceCounts[index] - 1;
            if (mSubsequenceCounts[index] < -degree) {
              ok = false;
              break;
            }
          }
        }
        for (int index = symbol; index < mSubsequenceCounts.length; index += symbols) {
          // Care needed here not to update counts for aa, bb, cc, etc.
          if (mSubsequenceCounts[index] < 0 && index != symbol * symbols + symbol) {
            mChangeList.set(sp++, index);
            mSubsequenceCounts[index] = -mSubsequenceCounts[index] + 1;
            if (mSubsequenceCounts[index] > degree) {
              ok = false;
              break;
            }
          }
        }
        if (ok) {
          search(degree, symbols, symbol, currentLength + 1, Math.max(maxUsedSymbol, symbol), sp);
        }
        for (int k = changeListStart; k < sp; ++k) {
          final int index = mChangeList.get(k);
          if (mSubsequenceCounts[index] < 0) {
            mSubsequenceCounts[index] = -mSubsequenceCounts[index] - 1;
          } else {
            mSubsequenceCounts[index] = -mSubsequenceCounts[index] + 1;
          }
        }
      }
    }
  }

  protected long davenportSchinzel(final int d, final int n) {
    mL = 0;
    mSubsequenceCounts = new int[n * n];
    search(d, n, -1, 0, -1, 0);
    return mL;
  }

  @Override
  public Z next() {
    return Z.valueOf(davenportSchinzel(4, ++mN));
  }

  /**
   * Compute Davenport-Schinzel numbers.
   * @param args degree and number of symbols
   */
  public static void main(final String[] args) {
    final A002004 s = new A002004();
    System.out.println(String.valueOf(s.davenportSchinzel(Integer.parseInt(args[0]), Integer.parseInt(args[1]))));
  }
}
