package irvine.oeis.a082;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;
import irvine.util.array.LongDynamicByteArray;

/**
 * A082626.
 * @author Sean A. Irvine
 */
public class A082636 extends Sequence1 {

  private static final long LIMIT = 1L << 32; // Limits memory use, cannot find solutions that exceed this
  private final LongDynamicByteArray mCounts = new LongDynamicByteArray();
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private final Fast mPrime = new Fast();
  private int mN = 0;
  private long mM = 1;
  private long mP = 1;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      mP = mPrime.nextPrime(mP);
      if (mP > LIMIT) {
        throw new UnsupportedOperationException();
      }
      long sum = 0;
      long cnt = 0;
      for (long q = mP; q > 1; q = mPrime.prevPrime(q)) {
        sum += q;
        if (sum > LIMIT) {
          break;
        }
        ++cnt;
        if (sum % cnt == 0 && mCounts.increment(sum) < 0) {
          mCounts.set(sum, Byte.MAX_VALUE);
        }
      }
      while (mM < mP) {
        final int soln = mCounts.get(++mM);
        if (soln >= mN && mFirsts.get(soln) == 0) {
          mFirsts.set(soln, mM);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
