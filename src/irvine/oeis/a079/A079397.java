package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A079397 Smallest prime with memory = n.
 * @author Sean A. Irvine
 */
public class A079397 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      mP = mPrime.nextPrime(mP);
      final long cnt = Functions.PRIME_MEMORY.l(mP);
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mP);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
