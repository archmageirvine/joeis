package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A077193.
 * @author Sean A. Irvine
 */
public class A077216 extends Sequence0 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = -1;
  private long mP = 1;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      mP = Functions.NEXT_PRIME.l(mP);
      final long q = Functions.NEXT_PRIME.l(mP);
      long val2 = 0;
      for (long c = mP + 1; c < q; ++c) {
        long t = c;
        while ((t & 1) == 0) {
          ++val2;
          t >>>= 1;
        }
      }
      if (mFirsts.get(val2) == 0) {
        mFirsts.set(val2, mP);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

