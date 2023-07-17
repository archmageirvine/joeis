package irvine.oeis.a049;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A049881 a(n) is the number of distinct sums of 3 different primes chosen from the first n primes.
 * @author Sean A. Irvine
 */
public class A049881 extends A049880 {

  /** Construct the sequence. */
  public A049881() {
    super(3);
  }

  protected final TreeSet<Long> mSeen2 = new TreeSet<>();
  private long mP = 3;

  @Override
  public Z next() {
    super.next();
    mP = mPrime.nextPrime(mP);
    for (final long q : mSeen) {
      mSeen2.add(mP + q);
    }
    return Z.valueOf(mSeen2.size());
  }
}
