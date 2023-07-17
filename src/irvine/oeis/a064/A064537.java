package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A064537 Limit of the recursion B_[k] = P[k](B_[k-1]), where B_[0] = (1,2,3,4,5,...) and P[k] is the permutation that permutes the entries k+j and 2k + j for all j = 1,..,k.
 * @author Sean A. Irvine
 */
public class A064537 extends Sequence1 {

  // We assume a(k) = 0 really means a(k) = k
  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mN = 0;

  private void step(final long n) {
    for (long k = 1; k <= n; ++k) {
      final long j = n + k;
      final long t = mA.get(j);
      final long i = 2 * n + k;
      final long u = mA.get(i);
      mA.set(j, u == 0 ? i : u);
      mA.set(i, t == 0 ? j : t);
    }
  }

  @Override
  public Z next() {
    ++mN;
    step(3 * mN - 2);
    step(3 * mN - 1);
    step(3 * mN);
    final long t = mA.get(mN);
    return Z.valueOf(t == 0 ? mN : t);
  }
}

