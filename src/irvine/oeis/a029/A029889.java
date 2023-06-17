package irvine.oeis.a029;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A029889 Number of graphical partitions (degree-vectors for graphs with n vertices, allowing self-loops which count as degree 1; or possible ordered row-sum vectors for a symmetric 0-1 matrix).
 * @author Sean A. Irvine
 */
public class A029889 extends AbstractSequence {

  /* Construct the sequence. */
  public A029889() {
    super(0);
  }

  // A matrix based approach, only good for a few terms

  protected int mN = -1;
  private long mCount;
  private final HashSet<List<Integer>> mSeen = new HashSet<>();
  private int[] mRowSums;

  protected boolean accept(final int[] rowSums) {
    return true;
  }

  protected long count(final HashSet<List<Integer>> seen) {
    return seen.size();
  }

  private void search(final int row) {
    // We use swizzle so we can generate possible graphical partitions in increasing order
    if (row == mN) {
      //System.out.println(Arrays.toString(mRowSums));
      if (accept(mRowSums)) {
        mSeen.add(Arrays.stream(mRowSums).boxed().collect(Collectors.toList()));
      }
      return;
    }
    final int prev = row == 0 ? mN : mRowSums[row - 1];
    for (int setBits = 0; setBits + mRowSums[row] <= prev; ++setBits) {
      if (setBits == 0) {
        if (mRowSums[row] <= prev) {
          search(row + 1);
        }
      } else {
        final long limit = 1L << (mN - row);
        mRowSums[row] += setBits;
        for (long r = (1L << setBits) - 1; r < limit; r = LongUtils.swizzle(r)) {
          // mirror the bits
          long t = r;
          for (int k = 1; k < mN - row; ++k) {
            if ((t & 1) == 1) {
              ++mRowSums[mN - k];
            }
            t >>>= 1;
          }
          search(row + 1);
          // unmirror the bits
          t = r;
          for (int k = 1; k < mN - row; ++k) {
            if ((t & 1) == 1) {
              --mRowSums[mN - k];
            }
            t >>>= 1;
          }
        }
        mRowSums[row] -= setBits;
      }
      if (row == 0) {
        // We always find the first row sums in order, so we can count them as
        // soon as we are done with a particular first row sum.
        mCount += count(mSeen);
        mSeen.clear();
      }
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mCount = 0;
    mRowSums = new int[mN];
    search(0);
    return Z.valueOf(mCount);
  }
}
