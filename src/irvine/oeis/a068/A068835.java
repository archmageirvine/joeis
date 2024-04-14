package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A068835 Start of first occurrence of just n consecutive primes with all even digits except the least significant digit.
 * @author Sean A. Irvine
 */
public class A068835 extends Sequence1 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private final Fast mPrime = new Fast();
  private int mN = 0;
  private long mP = 1;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      if (mP == 1) {
        mP = 11; // avoid getting a(3)=3
        return Z.TWO;
      }
      mP = mPrime.nextPrime(mP);
      long q = mP;
      int cnt = 0;
      while ((Functions.SYNDROME.i(q / 10) & 0b1010101010) == 0) {
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
