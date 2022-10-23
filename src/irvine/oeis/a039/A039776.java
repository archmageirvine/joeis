package irvine.oeis.a039;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039776 Number of new fractions m/n, where m is 1 or composite, (m,n) = 1 and "new" means the value of mn has not occurred before.
 * @author Sean A. Irvine
 */
public class A039776 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeSet<Long> mSeen = new TreeSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long c = 1; c <= mN; ++c) {
      if (!mPrime.isPrime(c) && LongUtils.gcd(c, mN) == 1) {
        final long pn = c * mN;
        if (mSeen.add(pn)) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
