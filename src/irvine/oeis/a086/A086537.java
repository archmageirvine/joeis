package irvine.oeis.a086;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086537 Beginning with 1, the smallest number not yet seen such that every partial sum has a distinct prime signature.
 * @author Sean A. Irvine
 */
public class A086537 extends Sequence1 {

  private final HashSet<Z> mSeen = new HashSet<>();
  private final TreeSet<Long> mUsed = new TreeSet<>();
  private Z mSum = Z.ZERO;
  private long mLeastUnused = 1;

  @Override
  public Z next() {
    while (mUsed.remove(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = mLeastUnused;
    while (true) {
      if (!mUsed.contains(k)) {
        final Z t = mSum.add(k);
        if (mSeen.add(FactorUtils.leastPrimeSignature(t))) {
          mSum = t;
          mUsed.add(k);
          return Z.valueOf(k);
        }
      }
      ++k;
    }
  }
}
