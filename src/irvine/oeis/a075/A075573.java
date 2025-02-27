package irvine.oeis.a075;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075573 a(1)=1; a(n) is the smallest positive number not occurring earlier, with different parity from a(n-1), such that sum of any subsequence of two or more consecutive terms is composite.
 * @author Sean A. Irvine
 */
public class A075573 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private final List<Z> mSums = new ArrayList<>();
  private boolean mEven = true;

  private boolean ok(final long m) {
    for (final Z s : mSums) {
      if (s.add(m).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    mEven = !mEven;
    long m = mEven ? 0 : - 1;
    while (true) {
      m += 2;
      if (!mUsed.contains(m) && ok(m)) {
        mUsed.add(m);
        for (int k = 0; k < mSums.size(); ++k) {
          mSums.set(k, mSums.get(k).add(m));
        }
        final Z res = Z.valueOf(m);
        mSums.add(res);
        return res;
      }
    }
  }
}

