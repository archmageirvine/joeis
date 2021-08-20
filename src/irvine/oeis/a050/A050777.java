package irvine.oeis.a050;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.util.array.DynamicLongArray;

/**
 * A050777 First occurrence from iterated procedure 'composite k added to sum of its prime factors reaches a prime' yielding n skipped primes.
 * @author Sean A. Irvine
 */
public class A050777 extends A050703 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private final Fast mPrime = new Fast();
  private int mM = 0;
  private long mN = 1;

  @Override
  public Z next() {
    ++mM;
    while (mFirsts.get(mM) == 0) {
      final Z n = Z.valueOf(++mN);
      if (!n.isProbablePrime()) {
        Z t = f(n);
        while (!t.isProbablePrime()) {
          t = f(t);
        }
        Z p = n;
        int cnt = 0;
        while (p.compareTo(t) < 0) {
          p = mPrime.nextPrime(p);
          ++cnt;
        }
        if (mFirsts.get(cnt) == 0) {
          mFirsts.set(cnt, mN);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mM));
  }
}
