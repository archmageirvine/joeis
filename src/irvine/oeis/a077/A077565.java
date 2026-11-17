package irvine.oeis.a077;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicArray;

/**
 * A077565 Number of factorizations of n where each factor has a different prime signature.
 * @author Sean A. Irvine
 */
public class A077565 extends Sequence1 implements DirectSequence {

  private int mN = 0;
  private final LongDynamicArray<int[]> mSignatures = new LongDynamicArray<>();
  private long mCount = 0;

  private int[] signature(final long n) {
    final int[] s = mSignatures.get(n);
    if (s != null) {
      return s;
    }
    final int[] v = FactorUtils.sortedPrimeSignature(Z.valueOf(n));
    mSignatures.set(n, v);
    return v;
  }

  private boolean seen(final List<int[]> seen, final int[] sig) {
    for (final int[] s : seen) {
      if (Arrays.equals(s, sig)) {
        return true;
      }
    }
    return false;
  }

  private void count(final long n, final long k, final List<int[]> seen) {
    if (n <= k) {
      return;
    }
    final int[] sn = signature(n);
    if (!seen(seen, sn)) {
      ++mCount;
    }
    for (long m = k + 1; m < n; ++m) {
      if (n % m == 0) {
        final int[] sm = signature(m);
        if (!seen(seen, sm)) {
          seen.add(sm);
          count(n / m, m, seen);
          seen.remove(seen.size() - 1);
        }
      }
    }
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    if (n < 8) {
      return Z.ONE;
    }
    mCount = 0;
    count(n, 1, new ArrayList<>());
    return Z.valueOf(mCount);
  }
}
