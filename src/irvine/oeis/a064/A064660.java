package irvine.oeis.a064;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A064660 The number of distinct parts in the partition sequence lambda(n) formed by the recurrence lambda(1) = 1 and lambda(n+1) is the sum of lambda(n) and its conjugate.
 * @author Sean A. Irvine
 */
public class A064660 extends Sequence1 {

  private LongDynamicLongArray mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = new LongDynamicLongArray();
      mA.set(0, 1L);
    } else {
      mA = IntegerPartition.merge(mA, IntegerPartition.dual(mA));
    }
    long cnt = 1;
    long prev = mA.get(0);
    for (long k = 1; k < mA.length(); ++k) {
      final long a = mA.get(k);
      if (a != prev) {
        ++cnt;
      }
      if (a == 1) {
        break;
      }
      prev = a;
    }
    return Z.valueOf(cnt);
  }
}
