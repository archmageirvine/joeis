package irvine.oeis.a069;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069916 Number of log-concave compositions (ordered partitions) of n.
 * @author Sean A. Irvine
 */
public class A069916 extends Sequence0 {

  private int mN = -1;
  private long mCount = 0;

  private final MemoryFunctionInt3<Long> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Long compute(final int remaining, final int k, final int j) {
      if (remaining == 0) {
        return 1L;
      } else {
        long sum = 0;
        for (int i = 1; i <= remaining; ++i) {
          if ((long) j * j >= (long) k * i) { // Concavity condition
            sum += mB.get(remaining - i, j, i);
          }
        }
        return sum;
      }
    }
  };

  private void search(final int remaining, final int k) {
    if (remaining == 0) {
      ++mCount;
    } else {
      for (int j = 1; j <= remaining; ++j) {
        mCount += mB.get(remaining - j, k, j);
      }
    }
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    mCount = 0;
    for (int k = 1; k <= mN; ++k) {
      search(mN - k, k);
    }
    return Z.valueOf(mCount);
  }
}
