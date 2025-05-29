package irvine.oeis.a077;

import java.util.Arrays;

import irvine.factor.util.FactorUtils;
import irvine.math.partition.DistinctPartsPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicArray;

/**
 * A077564 Number of partitions of n into parts with distinct prime signatures.
 * @author Sean A. Irvine
 */
public class A077564 extends Sequence0 {

  private int mN = -1;
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

  private boolean is(final int[] p) {
    for (int k = 1; k < p.length; ++k) {
      final int[] sk = signature(p[k]);
      for (int j = 0; j < k; ++j) {
        if (Arrays.equals(signature(p[j]), sk)) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ONE;
    }
    // Clearly the parts need to be distinct
    final DistinctPartsPartition part = new DistinctPartsPartition(mN);
    int[] p;
    int cnt = 0;
    while ((p = part.next()) != null) {
      if (is(p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
