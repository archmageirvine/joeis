package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A064480 Form a conjugate partition of row with 1+1+1 in first row. all other rows are the union of their parents. a(n) = number of types of piles in the n-th row.
 * @author Sean A. Irvine
 */
public class A064480 extends Sequence1 {

  // We cannot use our ordinary int[] representation of partitions here because
  // they exceed the length representable in an int array

  private LongDynamicLongArray mPartition = null;

  // These next two methods copied from IntegerPartition and update to this type
  private static LongDynamicLongArray conjugate(final LongDynamicLongArray p) {
    final LongDynamicLongArray dual = new LongDynamicLongArray();
    for (long k = 0, j = p.length() - 1; k < p.get(0); ++k) {
      while (p.get(j) <= k) {
        --j;
      }
      dual.set(k, j + 1);
    }
    return dual;
  }

  private static LongDynamicLongArray merge(final LongDynamicLongArray p1, final LongDynamicLongArray p2) {
    final LongDynamicLongArray v = new LongDynamicLongArray();
    final long len = p1.length() + p2.length();
    for (long i = 0, j = 0, k = 0; k < len; ++k) {
      if (i < p1.length() && j < p2.length()) {
        if (p1.get(i) >= p2.get(j)) {
          v.set(k, p1.get(i++));
        } else {
          v.set(k, p2.get(j++));
        }
      } else if (i < p1.length()) {
        v.set(k, p1.get(i++));
      } else {
        v.set(k, p2.get(j++));
      }
    }
    return v;
  }

  @Override
  public Z next() {
    if (mPartition == null) {
      mPartition = new LongDynamicLongArray();
      mPartition.set(0, 1L);
      mPartition.set(1, 1L);
      mPartition.set(2, 1L);
    } else {
      mPartition = merge(mPartition, conjugate(mPartition));
    }
    long cnt = 1;
    for (long k = 1; k < mPartition.length(); ++k) {
      if (mPartition.get(k) != mPartition.get(k - 1)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
