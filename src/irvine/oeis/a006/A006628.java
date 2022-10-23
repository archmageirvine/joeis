package irvine.oeis.a006;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicIntArray;

/**
 * A006628 From a partition of the integers.
 * @author Sean A. Irvine
 */
public class A006628 extends Sequence1 {

  private final DynamicIntArray mAssignment = new DynamicIntArray();
  private final DynamicIntArray mFirsts = new DynamicIntArray();
  private final DynamicIntArray mCounts = new DynamicIntArray();
  private final ArrayList<DynamicIntArray> mSets = new ArrayList<>();
  {
    mSets.add(null); // ignore 0th entry
  }
  private int mN = 0;
  private int mM;

  // Generate partitions of mM into distinct parts such that each part is from the
  // same assignment set according to existing assignments (which will all be defined
  // since we have done all the numbers smaller than mM already).
  // We do not need to explicitly remember the partition itself.
  // Made even better by passing in the set of actual values that can be used in
  // each given partition.
  private int partitions(final DynamicIntArray set, final int prev, final int sum, final int idx) {
    if (sum == mM) {
      return idx + 1;
    } else {
      int max = 0;
      final int lim = mM - sum;
      for (int k = 0; k < set.length(); ++k) {
        final int v = set.get(k);
        if (v > prev && v <= lim) {
          max = Math.max(max, partitions(set, v, sum + v, idx + 1));
        }
      }
      return max;
    }
  }

  @Override
  public Z next() {
    ++mN;
    mSets.add(new DynamicIntArray());
    while (mFirsts.length() <= mN) {
      int mostParts = 1;
      ++mM;
      // Generate partitions of mM into distinct parts with assignment constraints
      for (int k = mM; k > 0; --k) {
        final int assignment = mAssignment.get(k);
        if (mCounts.get(assignment) > mostParts) {
          mostParts = Math.max(mostParts, partitions(mSets.get(assignment), k, k, 0));
        }
      }
      //System.out.println(mM + " -> " + mostParts);
      mAssignment.set(mM, mostParts);
      mCounts.set(mostParts, mCounts.get(mostParts) + 1);
      final DynamicIntArray set = mSets.get(mostParts);
      set.set(set.length(), mM);
      if (mFirsts.get(mostParts) == 0) {
        mFirsts.set(mostParts, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }

}

