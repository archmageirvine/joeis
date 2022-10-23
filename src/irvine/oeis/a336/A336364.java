package irvine.oeis.a336;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A336364 Rectangular array by antidiagonals: row n shows the positive integers whose distance to the nearest prime is n.
 * @author Sean A. Irvine
 */
public class A336364 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final List<TreeSet<Long>> mRows = new ArrayList<>();
  private int mCurrentRow = -1;
  private int mMaxRow = 0;
  private long mM = start();

  protected long start() {
    return 0;
  }

  @Override
  public Z next() {
    // Maintain not yet output terms in mRows.  At each step we need only remove
    // the first element from the selected row.
    if (++mCurrentRow > mMaxRow) {
      // Starting a new antidiagonal
      mCurrentRow = 0;
      ++mMaxRow;
    }
    while (mCurrentRow >= mRows.size() || mRows.get(mCurrentRow).isEmpty()) {
      // We need to keep looking to find the next term for this row
      if (++mM == 0) {
        // Only needed for A336365
        mRows.add(new TreeSet<>());
        mRows.add(new TreeSet<>());
        mRows.add(new TreeSet<>());
        mRows.get(2).add(0L);
      } else if (mPrime.isPrime(mM)) {
        mRows.get(0).add(mM);
      } else {
        final int d = (int) Math.min(mPrime.nextPrime(mM) - mM, mM - mPrime.prevPrime(mM));
        while (d >= mRows.size()) {
          mRows.add(new TreeSet<>());
        }
        mRows.get(d).add(mM);
      }
    }
    return Z.valueOf(mRows.get(mCurrentRow).pollFirst());
  }
}
