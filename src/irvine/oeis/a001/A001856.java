package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * A001856 A self-generating sequence: every positive integer occurs as a(i)-a(j) for a unique pair i,j.
 * @author Sean A. Irvine
 */
public class A001856 implements Sequence {

  private final ArrayList<Z> mSeq = new ArrayList<>();
  private final HashSet<Z> mDiffs = new HashSet<>();
  private Z mSmallestUnusedDiff = Z.TWO;

  // Removes smaller entries from hash set to keep memory usage down.
  private Z minUnusedDiff() {
    while (mDiffs.remove(mSmallestUnusedDiff)) {
      mSmallestUnusedDiff = mSmallestUnusedDiff.add(1);
    }
    mDiffs.add(mSmallestUnusedDiff);
    return mSmallestUnusedDiff;
  }

  private void updateDiffs(final Z t) {
    for (final Z a : mSeq) {
      final Z d = t.subtract(a);
      if (d.compareTo(mSmallestUnusedDiff) >= 0) {
        mDiffs.add(d);
      }
    }
  }

  @Override
  public Z next() {
    final int n = mSeq.size();
    if (n == 0) {
      mSeq.add(Z.ONE);
    } else if (n == 1) {
      mSeq.add(Z.TWO);
    } else if ((n & 1) == 0) {
      final Z t = mSeq.get(n - 1).multiply2();
      mSeq.add(t);
      updateDiffs(t);
    } else {
      final Z t = mSeq.get(n - 1).add(minUnusedDiff());
      mSeq.add(t);
      updateDiffs(t);
    }
    return mSeq.get(n);
  }
}
