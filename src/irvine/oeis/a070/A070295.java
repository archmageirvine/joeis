package irvine.oeis.a070;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a048.A048865;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A070295 Smallest composite number such that there are exactly n primes less than it (and coprime to it) which do not divide it, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A070295 extends A048865 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    // 11 is the only proven? 0, 223 and 482 potential 0's
    while (mN != 11 && mFirsts.get(mN) == 0) {
      final int cnt = super.next().intValueExact();
      if (!mPrime.isPrime(++mM)) {
        if (mFirsts.get(cnt) == 0) {
          mFirsts.set(cnt, mM);
        }
      }
      if (mVerbose && mM % 1000000 == 0) {
        StringUtils.message("Search completed to " + mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
