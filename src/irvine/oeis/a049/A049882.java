package irvine.oeis.a049;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A049882 a(n) is the number of distinct sums of 4 different primes chosen from the first n primes.
 * @author Sean A. Irvine
 */
public class A049882 extends A049881 {

  {
    setOffset(4);
  }

  private final TreeSet<Long> mSeen3 = new TreeSet<>();
  private long mP = 5;

  @Override
  public Z next() {
    super.next();
    mP = mPrime.nextPrime(mP);
    for (final long q : mSeen2) {
      mSeen3.add(mP + q);
    }
    return Z.valueOf(mSeen3.size());
  }
}
