package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A391373 The largest number with an arithmetic mean of divisors equal to n or 0 is there is no such number.
 * @author Sean A. Irvine
 */
public class A391373 extends Sequence1 {

  private final LongDynamicLongArray mLargest = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (mM <= 4 * mN * mN) {
      final Z s1 = Functions.SIGMA1.z(mM);
      final long s0 = Functions.SIGMA0.l(mM);
      if (s1.mod(s0) == 0) {
        mLargest.set(s1.divide(s0).longValueExact(), mM);
      }
      ++mM;
    }
    return Z.valueOf(mLargest.get(mN));
  }
}
