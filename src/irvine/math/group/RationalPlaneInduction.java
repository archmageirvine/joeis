package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Exact degree-two induction tests for a small stabilizer quotient.
 * @author Gregory Morse
 */
final class RationalPlaneInduction {

  private static final int[] TRACES = {2, 1, -1, -2, -1, 1, 0, 0, 0, 0, 0, 0};
  private final int[][] mTable;
  private final int mNegation;
  private final int[][] mCounts;
  private final int[] mRequired;
  private final int mIndex;
  private final List<Integer> mGenerators = new ArrayList<>();
  private final int[] mParent;
  private final int[] mLetter;
  private final int[] mQueue;
  private int mAttempts;

  private RationalPlaneInduction(final int[][] table, final int negation, final int[][] counts,
                                 final int[] required, final int index) {
    mTable = table;
    mNegation = negation;
    mCounts = counts;
    mRequired = required;
    mIndex = index;
    mParent = new int[table.length];
    mLetter = new int[table.length];
    mQueue = new int[table.length];
  }

  private int traversal() {
    Arrays.fill(mParent, -1);
    mParent[0] = 0;
    mQueue[0] = 0;
    int length = 1;
    for (int i = 0; i < length; ++i) {
      final int v = mQueue[i];
      for (int j = 0; j < mGenerators.size(); ++j) {
        final int x = mTable[v][mGenerators.get(j)];
        if (mParent[x] == -1) {
          mParent[x] = v;
          mLetter[x] = j;
          mQueue[length++] = x;
        }
      }
    }
    return length;
  }

  private static int product(final int a, final int b) {
    final int rotation = Math.floorMod(a % 6 + (a < 6 ? b % 6 : -(b % 6)), 6);
    return rotation + ((a < 6) == (b < 6) ? 0 : 6);
  }

  private static int order(final int[][] table, final int x) {
    int order = 1;
    for (int y = x; y != 0; y = table[y][x]) {
      ++order;
    }
    return order;
  }

  private boolean viable(final int[] images) {
    final int[] z = new int[mTable.length];
    for (int i = 1; i < mTable.length; ++i) {
      final int v = mQueue[i];
      z[v] = product(z[mParent[v]], images[mLetter[v]]);
    }
    if (z[mNegation] != 3) {
      return false;
    }
    for (int i = 0; i < mTable.length; ++i) {
      for (int j = 0; j < images.length; ++j) {
        if (product(z[i], images[j]) != z[mTable[i][mGenerators.get(j)]]) {
          return false;
        }
      }
    }
    for (int c = 0; c < mCounts.length; ++c) {
      int character = 0;
      for (int i = 0; i < z.length; ++i) {
        character += mCounts[c][i] * TRACES[z[i]];
      }
      if (mIndex * character != mRequired[c]) {
        return false;
      }
    }
    return true;
  }

  private boolean possible(final int[] orders, final int[] images, final int depth) {
    if (depth == orders.length) {
      return ++mAttempts > 150000 || viable(images);
    }
    for (int x = 0; x < 12; ++x) {
      int power = 0;
      for (int i = 0; i < orders[depth]; ++i) {
        power = product(power, x);
      }
      if (power == 0) {
        images[depth] = x;
        if (possible(orders, images, depth + 1)) {
          return true;
        }
      }
    }
    return false;
  }

  static boolean excludes(final int[][] table, final int negation, final int[][] counts, final int[] required, final int index) {
    final RationalPlaneInduction search = new RationalPlaneInduction(table, negation, counts, required, index);
    while (search.traversal() < table.length) {
      if (search.mGenerators.size() == 5) {
        return false;
      }
      for (int i = 1; i < table.length; ++i) {
        if (search.mParent[i] == -1) {
          search.mGenerators.add(i);
          break;
        }
      }
    }
    final int[] orders = search.mGenerators.stream().mapToInt(x -> order(table, x)).toArray();
    return !search.possible(orders, new int[orders.length], 0);
  }
}
