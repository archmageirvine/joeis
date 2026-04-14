package irvine.oeis.a394;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A394685 allocated for Thomas DiFiore.
 * @author Sean A. Irvine
 */
public class A394685 extends Sequence1 {

  private int mN = 0;
  private Set<Long> mStates = new HashSet<>();
  {
    mStates.add(0L); // empty set
  }

  private boolean isValid(final long mask, final int k, final long[] d) {
    for (final long x : d) {
      if ((mask & (1L << (x - 1))) == 0) {
        continue;
      }
      for (long z = x + 1; z < k; ++z) {
        if ((mask & (1L << (z - 1))) != 0) {
          continue;
        }
        if (z % x == 0 && k % z == 0) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    final long[] d = ZUtils.toLong(Jaguar.factor(mN).divisorsSorted()); // precompute divisors
    final Set<Long> next = new HashSet<>();
    for (final long mask : mStates) {
      // Don't include mN
      next.add(mask);
      // Include mN if valid
      if (isValid(mask, mN, d)) {
        next.add(mask | (1L << (mN - 1)));
      }
    }
    mStates = next;
    return Z.valueOf(mStates.size());
  }

}
