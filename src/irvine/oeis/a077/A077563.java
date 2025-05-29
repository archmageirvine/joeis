package irvine.oeis.a077;

import java.util.Arrays;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicArray;

/**
 * A077563 Number of partitions into two parts which have different prime signatures.
 * @author Sean A. Irvine
 */
public class A077563 extends Sequence0 {

  private long mN = -1;
  private final LongDynamicArray<int[]> mSignatures = new LongDynamicArray<>();

  private int[] signature(final long n) {
    final int[] s = mSignatures.get(n);
    if (s != null) {
      return s;
    }
    final int[] v = FactorUtils.sortedPrimeSignature(Z.valueOf(n));
    mSignatures.set(n, v);
    return v;
  }

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; 2 * k < mN; ++k) {
      if (!Arrays.equals(signature(k), signature(mN - k))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
