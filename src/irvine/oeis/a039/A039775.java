package irvine.oeis.a039;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039775 Number of new fractions m/n, where m is prime, (m,n)=1 and "new" means the value of mn has not occurred before.
 * @author Sean A. Irvine
 */
public class A039775 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeSet<Long> mSeen = new TreeSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long p = 2; p < mN; p = mPrime.nextPrime(p)) {
      if (LongUtils.gcd(p, mN) == 1) {
        final long pn = p * mN;
        if (mSeen.add(pn)) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
