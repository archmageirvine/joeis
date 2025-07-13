package irvine.oeis.a078;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A078693 Largest k such that round(1/(sqrt(prime(k+1))-sqrt(prime(k)))) = n where prime(n) denotes the n-th prime (conjectured values).
 * @author Sean A. Irvine
 */
public class A078693 extends Sequence1 {

  private static final long HEURISTIC = 100;
  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mM = 0;
  private long mP = 1;
  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  {
    mA.set(0L, 1L);
  }

  @Override
  public Z next() {
    ++mN;
    while (mM < HEURISTIC * mA.get(mN - 1)) {
      ++mM;
      mP = mPrime.nextPrime(mP);
      final long q = mPrime.nextPrime(mP);
      final long u = CR.valueOf(q).sqrt().subtract(CR.valueOf(mP).sqrt()).inverse().round().longValueExact();
      if (u > 0) {
        if (u < mN) {
          throw new RuntimeException("Previous value " + mA.get(u) + " output for n=" + u + " should have been at least " + mM);
        }
        mA.set(u, mM);
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}

