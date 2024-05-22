package irvine.oeis.a034;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034880 Minimal number of rectangles with integer sides that will form any rectangle with area n.
 * @author Sean A. Irvine
 */
public class A034880 extends Sequence1 {

  // All the component rectangles must be 1 x k for various k, because one of
  // the rectangles to be considered is 1 x n.   Therefore, the solution must
  // be among the partitions of n.
  //
  // If n is prime, then a single 1 x n block suffices. That is, a(p)=1.
  //
  // Consider the squarest rectangle among the possibilities, n = a*b, a <= b.
  // For example, n = 24 = 4 * 6.  Then, there must be at least "a" parts in
  // the partition and no part can exceed "b".
  //
  // So, determine all partitions of n satisfying the constraints introduced
  // by "a" and "b".  Sort this list in order of increasing number of parts.
  //
  // For each partition in the sorted list, test if it can be played into
  // all the rectangles for n.  If not, reject the partition and move to
  // the next one.  Otherwise, we have found the minimum.

  private int mN = 0;

  /**
   * Determine all integer rectangles with area <code>n</code>.
   * @param n area
   * @return list of longest side of rectangles with area <code>n</code>
   */
  private List<Integer> getSides(final int n) {
    final List<Integer> sides = new ArrayList<>();
    for (int k = n; k * k >= n; --k) {
      if (n % k == 0) {
        sides.add(k);
      }
    }
    return sides;
  }

  /**
   * Get all the partitions of <code>n</code> with at least <code>minNumParts</code>
   * parts and with no part exceeding <code>maxPart</code>.  Sort the result by
   * increasing number of parts.
   * @param n area
   * @param minNumParts minimum number of parts
   * @param maxPart largest allowable part
   * @return partitions
   */
  private List<int[]> getPartitions(final int n, final int minNumParts, final int maxPart) {
    final List<int[]> partitions = new ArrayList<>();
    final IntegerPartition part = new IntegerPartition(n);
    int[] p;
    while ((p = part.next()) != null) {
      if (p.length >= minNumParts && Functions.MAX.i(p) <= maxPart) {
        partitions.add(Arrays.copyOf(p, p.length));
      }
    }
    partitions.sort((o1, o2) -> {
      final int c = Integer.compare(o1.length, o2.length);
      if (c != 0) {
        return c;
      }
      for (int k = 0; k < o1.length; ++k) {
        final int ck = Integer.compare(o1[k], o2[k]);
        if (ck != 0) {
          return ck;
        }
      }
      return 0;
    });
    return partitions;
  }

  private boolean isHorizontalPlayable(final boolean[][] rectangle, final int x, final int y, final int len) {
    for (int k = 0; k < len; ++k) {
      if (rectangle[y][x + k]) {
        // No we cannot play here
        for (int j = 0; j < k; ++j) {
          rectangle[y][x + j] = false; // unwind
        }
        return false;
      }
      rectangle[y][x + k] = true;
    }
    return true;
  }

  private boolean isVerticalPlayable(final boolean[][] rectangle, final int x, final int y, final int len) {
    for (int k = 0; k < len; ++k) {
      if (rectangle[y + k][x]) {
        // No we cannot play here
        for (int j = 0; j < k; ++j) {
          rectangle[y + j][x] = false; // unwind
        }
        return false;
      }
      rectangle[y + k][x] = true;
    }
    return true;
  }

  private boolean isPlayable(final int[] partition, final boolean[] used, final boolean[][] rectangle, final int x, final int y, final int cnt) {
    if (cnt == partition.length) {
      return true; // All partition components were played
    }
    if (x >= rectangle[0].length) {
      // Move to next row
      return isPlayable(partition, used, rectangle, 0, y + 1, cnt);
    }
    if (rectangle[y][x]) {
      return isPlayable(partition, used, rectangle, x + 1, y, cnt); // already occupied
    }
    // (x,y) is empty, try each unplayed length in turn in each direction
    for (int k = 0, len = 0; k < partition.length; ++k) {
      if (!used[k] && partition[k] != len) {
        // Found a partition element of a length not yet tried at this location
        len = partition[k];
        used[k] = true;
        // Try and play across
        if (x + len <= rectangle[0].length && isHorizontalPlayable(rectangle, x, y, len)) {
          if (isPlayable(partition, used, rectangle, x + len, y, cnt + 1)) {
            return true;
          }
          Arrays.fill(rectangle[y], x, x + len, false); // unplay
        }
        // Try and play down
        if (y + len <= rectangle.length && isVerticalPlayable(rectangle, x, y, len)) {
          if (isPlayable(partition, used, rectangle, x + 1, y, cnt + 1)) {
            return true;
          }
          // unplay
          for (int j = 0; j < len; ++j) {
            rectangle[y + j][x] = false;
          }
        }
        used[k] = false;
      }
    }
    return false;
  }

  private boolean isPlayable(final int[] partition, final int rows, final int cols) {
    final boolean[][] rectangle = new boolean[rows][cols];
    final boolean[] used = new boolean[partition.length];
    return isPlayable(partition, used, rectangle, 0, 0, 0);
  }

  /**
   * Test if a partition can be applied into every possible rectangle.
   * @param partition the partition
   * @param n area (sum of partition)
   * @param sides possible longest side lengths of rectangle
   * @return true iff the partition works for very rectangle
   */
  private boolean isPlayable(final int[] partition, final int n, final List<Integer> sides) {
    for (final int side : sides) {
      if (!isPlayable(partition, n / side, side)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final List<Integer> sides = getSides(++mN);
    //System.out.println(mN + " Rectangle long sides = " + sides);
    if (sides.size() == 1) {
      return Z.ONE; // prime length only possible is 1 x mN
    }
    final int s = sides.get(sides.size() - 1);
    for (final int[] p : getPartitions(mN, mN / s, s)) {
      //System.out.println(Arrays.toString(p));
      if (isPlayable(p, mN, sides)) {
        return Z.valueOf(p.length);
      }
    }
    throw new RuntimeException();
  }
}
