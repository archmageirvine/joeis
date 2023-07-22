package irvine.oeis.a064;

import irvine.math.partitions.IntegerPartition;
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

  @Override
  public Z next() {
    if (mPartition == null) {
      mPartition = new LongDynamicLongArray();
      mPartition.set(0, 1L);
      mPartition.set(1, 1L);
      mPartition.set(2, 1L);
    } else {
      mPartition = IntegerPartition.merge(mPartition, IntegerPartition.dual(mPartition));
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
