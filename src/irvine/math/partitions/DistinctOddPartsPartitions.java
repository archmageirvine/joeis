package irvine.math.partitions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.math.IntegerUtils;

/**
 * Generate partitions into distinct odd parks. Note that if you want the count of these
 * then see A000700.
 * @author Sean A. Irvine
 */
public final class DistinctOddPartsPartitions {

  private final int[] mWorkspace;
  private final List<int[]> mPartitions = new ArrayList<>();

  private DistinctOddPartsPartitions(final int n) {
    mWorkspace = new int[IntegerUtils.sqrt(n)]; // sum_{k=1..n} (2*k+1) = (n+1)^2
  }

  private void search(final int remaining, final int pos) {
    if (remaining == 0) {
      mPartitions.add(Arrays.copyOf(mWorkspace, pos));
      return;
    }
    final int start = pos > 0 ? mWorkspace[pos - 1] - 2 : (remaining - 1) | 1;
    if (pos < mWorkspace.length && (start + 1) * (start + 1) >= remaining) {
      for (int k = start; k > 0; k -= 2) {
        mWorkspace[pos] = k;
        search(remaining - k, pos + 1);
      }
    }
  }

  /**
   * Construct all the partitions of the given number into distinct odd parts.
   * @param n number to partition
   * @return partitions
   */
  public static List<int[]> partitions(final int n) {
    final DistinctOddPartsPartitions part = new DistinctOddPartsPartitions(n);
    part.search(n, 0);
    return part.mPartitions;
  }
}

