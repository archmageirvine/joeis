package irvine.oeis.a096;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A096695 Least balanced prime (A090403) of index n (A096693).
 * @author Sean A. Irvine
 */
public class A096695 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private long mP = 1;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      mP = mPrime.nextPrime(mP);
      int cnt = 1;
      long q = mP;
      long r = mP;
      long s = mP;
      long m = 1;
      while (q != 2) {
        q = mPrime.prevPrime(q);
        r = mPrime.nextPrime(r);
        s += q;
        s += r;
        m += 2;
        if (s == m * mP) {
          ++cnt;
        }
      }
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mP);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
