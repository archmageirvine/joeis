package irvine.oeis.a077;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077553 Triangle in which the n-th row contains n distinct composite numbers with the least product and has least number of prime divisors. No member of a row is a multiple of another member of the row.
 * @author Sean A. Irvine
 */
public class A077553 extends Sequence1 {

  // Only numbers 2p, 3p, ..., p^2 can appear

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private int mM = 0;
  private long mMaxP = 2;
  private List<Long> mRow = Collections.emptyList();

  protected List<Long> buildComposites(final long max) {
    final TreeSet<Long> set = new TreeSet<>();
    for (long p = 2; p <= max; p = mPrime.nextPrime(p)) {
      for (long q = 2; q <= p; q = mPrime.nextPrime(q)) {
        set.add(p * q);
      }
    }
    return new ArrayList<>(set);
  }

  @Override
  public Z next() {
    if (mRow.isEmpty() || ++mM >= mN) {
      ++mN;
      while (mRow.size() < mN) {
        mRow = buildComposites(mMaxP);
        ++mMaxP;
      }
      mM = 0;
    }
    return Z.valueOf(mRow.get(mM));
  }
}
