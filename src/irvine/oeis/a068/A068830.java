package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A068830 Smallest member of the first occurrence of exactly n consecutive primes with all odd digits.
 * @author Sean A. Irvine
 */
public class A068830 extends Sequence1 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private final Fast mPrime = new Fast();
  private int mN = 0;
  private long mP = 2;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      mP = mPrime.nextPrime(mP);
      long q = mP;
      int cnt = 0;
      while ((Functions.SYNDROME.i(q) & 0b101010101) == 0) {
        q = mPrime.nextPrime(q);
        ++cnt;
      }
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mP);
      }
      mP = q;
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
