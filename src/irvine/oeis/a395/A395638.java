package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A395638 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A395638 extends Sequence0 {

  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = -1;
  private long mK = 2;

  @Override
  public Z next() {
    ++mN;
    if (mN > Functions.FIBONACCI.l(mK)) {
      final long fn = Functions.FIBONACCI.l(mK);
      for (long y = 2; y <= mK; ++y) {
        final long fy = Functions.FIBONACCI.l(y);
        for (long x = 2; x <= mK; ++x) {
          final long fx = Functions.FIBONACCI.l(x);
          mCounts.increment(2 * fx * fx + fy * fn);
        }
      }
      for (long z = 2; z < mK; ++z) {
        final long fz = Functions.FIBONACCI.l(z);
        for (long x = 2; x <= mK; ++x) {
          final long fx = Functions.FIBONACCI.l(x);
          mCounts.increment(2 * fx * fx + fn * fz);
        }
      }
      for (long z = 2; z < mK; ++z) {
        final long fz = Functions.FIBONACCI.l(z);
        for (long y = 2; y < mK; ++y) {
          final long fy = Functions.FIBONACCI.l(y);
          mCounts.increment(2 * fn * fn + fy * fz);
        }
      }
      ++mK;
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
