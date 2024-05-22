package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicByteArray;

/**
 * A057710 Positive integers k with exactly 2 aliquot sequence predecessors. In other words, there are exactly two solutions x for which s(x) = n. The function s(x) here is the sum of all proper divisors of x (A001065).
 * @author Sean A. Irvine
 */
public class A057710 extends Sequence1 {

  private final LongDynamicByteArray mCount = new LongDynamicByteArray();
  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      while (mM < mN * mN) {
        final long s = Functions.SIGMA1.l(mM) - mM;
        final byte c = mCount.get(s);
        if (c <= 2) {
          mCount.set(s, (byte) (c + 1));
        }
        ++mM;
      }
      if (mCount.get(mN) == 2) {
        return Z.valueOf(mN);
      }
    }
  }
}
