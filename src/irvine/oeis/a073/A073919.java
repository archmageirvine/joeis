package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A073919 Smallest prime p with bigomega(p-1)=n, where bigomega(m)=A001222(m) is the number of prime divisors of m (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A073919 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private int mN = -1;
  private long mP = 1;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      mP = mPrime.nextPrime(mP);
      final long bigOmega = Functions.BIG_OMEGA.l(mP - 1);
      if (mFirsts.get(bigOmega) == 0) {
        mFirsts.set(bigOmega, mP);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

