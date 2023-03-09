package irvine.oeis.a061;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000081;
import irvine.oeis.a008.A008578;

/**
 * A061773 Triangle in which n-th row lists Matula-Goebel numbers for all rooted trees with n nodes.
 * @author Sean A. Irvine
 */
public class A061773 extends Sequence1 {

  // Cf. Kevin Ryde, https://oeis.org/A061773/a061773.gp.txt

  private final MemorySequence mNumTrees = MemorySequence.cachedSequence(new A000081());
  private final MemorySequence mPrimes = MemorySequence.cachedSequence(new A008578());
  private final ArrayList<List<Z>> mRows = new ArrayList<>();
  private final ArrayList<List<Z>> mSortedRows = new ArrayList<>();
  private final ArrayList<List<Long>> mBigs = new ArrayList<>();
  {
    mRows.add(Collections.emptyList()); // 0th not used
    mSortedRows.add(Collections.emptyList()); // 0th not used
    mBigs.add(Collections.emptyList()); // 0th not used
  }
  private long mBigIdx = 0;
  private int mN = 0;
  private int mM = 0;

  private void nextRow() {
    final int n = mRows.size();
    if (n == 1) {
      mRows.add(Collections.singletonList(Z.ONE));
      mSortedRows.add(Collections.singletonList(Z.ONE));
      mBigs.add(Collections.singletonList(0L));
    } else {
      final ArrayList<Z> row = new ArrayList<>();
      final ArrayList<Long> bigs = new ArrayList<>();
      mRows.add(row);
      mBigs.add(bigs);
      // Non-planted trees
      for (int p = 2; p < n; ++p) { // Number of vertices in planted part
        final int s = n - p + 1; // Number of vertices in other part
        final int upper = mNumTrees.a(p).intValueExact();
        for (int i = upper - mNumTrees.a(p - 1).intValueExact(); i < upper; ++i) {
          final Z bigP = mRows.get(p).get(i); // Planted tree P
          final long bigPP = mBigs.get(p).get(i); // Bigness of its Z subtree
          for (int j = 0; j < mRows.get(s).size(); ++j) {
            if (bigPP < mBigs.get(s).get(j)) {
              break;
            }
            row.add(mRows.get(s).get(j).multiply(bigP));
            bigs.add(bigPP);
          }
        }
      }
      // Planted trees
      for (int i = 0; i < mNumTrees.a(n - 1).intValueExact(); ++i) {
        row.add(mPrimes.a(mRows.get(n - 1).get(i).intValueExact()));
        bigs.add(++mBigIdx);
      }
      final ArrayList<Z> sort = new ArrayList<>(row);
      Collections.sort(sort);
      mSortedRows.add(sort);
    }
  }

  @Override
  public Z next() {
    if (++mM >= mSortedRows.get(mN).size()) {
      ++mN;
      nextRow();
      mM = 0;
    }
    return mSortedRows.get(mN).get(mM);
  }
}
