package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A393615 allocated for Dimas Saputra.
 * @author Sean A. Irvine
 */
public class A393615 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final LongDynamicLongArray dp = new LongDynamicLongArray();
    final long lim = mN * mN * mN + 2;
    for (long k = 1; k < lim; ++k) {
      dp.set(k, mN + 1);
    }
    for (long k = 1; k <= mN; ++k) {
      final long s = k * k;
      for (long v = s; v < lim; ++v) {
        if (dp.get(v - s) + 1 < dp.get(v)) {
          dp.set(v, dp.get(v - s) + 1);
        }
      }
    }
    long res = 0;
    for (long v = 1; v < lim; ++v) {
      if (dp.get(v) <= mN) {
        res = v;
      } else {
        break;
      }
    }
    return Z.valueOf(res);
  }
}
