package irvine.oeis.a389;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389805 allocated for Hu Junhua.
 * @author Sean A. Irvine
 */
public class A389805 extends Sequence1 {

  private int mN = 0;
  private long mS = 0;
  private long mCount = 0;
  private ArrayList<Long> mIrred = null;

  private boolean isBalanced(long set, final int n) {
    long sum = 0;
    long c = 0;
    for (int j = 1; set != 0; ++j, set >>>= 1) {
      if ((set & 1) == 1) {
        sum += j;
        ++c;
      }
    }
    return 2 * sum == c * (n + 1); // i.e., sum/c = (n+1)/2
  }

  private boolean isReducible(final long set, final HashSet<Long> irred) {
    for (final long i : irred) {
      if ((set & i) == i) {
        return true;
      }
    }
    return false;
  }

  private Collection<Long> buildIrreducibleBalancedSamples(final int n) {
    final HashSet<Long> irred = new HashSet<>();
    final long lim = 1L << n;
    for (long k = 1; k < lim; k = 2 * k + 1) {
      final HashSet<Long> irredK = new HashSet<>();
      for (long j = k; j < lim; j = Functions.SWIZZLE.l(j)) {
        if (isBalanced(j, n) && !isReducible(j, irred)) {
          irredK.add(j);
        }
      }
      irred.addAll(irredK);
    }
    return irred;
  }

  private void search(final long used, final int pos) {
    if (used == mS) {
      ++mCount;
      return;
    }
    for (int k = pos; k < mIrred.size(); ++k) {
      final long v = mIrred.get(k);
      if ((used & v) == 0) {
        search(used | v, k + 1);
      }
    }
  }

  @Override
  public Z next() {
    mS = (1L << ++mN) - 1;
    mCount = 0;
    mIrred = new ArrayList<>(buildIrreducibleBalancedSamples(mN));
    search(0, 0);
    return Z.valueOf(mCount);
  }
}
