package irvine.oeis.a082;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A082431 a(n) = the smallest prime p such that there are exactly n sets of consecutive primes, each of which has an arithmetic mean of p.
 * @author Sean A. Irvine
 */
public class A082431 extends Sequence1 {

  // todo not correct, this reproduces A096695 this this sequence

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
      System.out.println(mP + " " + cnt);
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mP);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
