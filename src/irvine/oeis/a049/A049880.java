package irvine.oeis.a049;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A049880 a(n) is the number of distinct sums of 2 different primes chosen from the first n primes.
 * @author Sean A. Irvine
 */
public class A049880 extends AbstractSequence {

  /* Construct the sequence. */
  public A049880() {
    super(2);
  }

  protected final TreeSet<Long> mSeen = new TreeSet<>();
  protected final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    for (long q = 2; q != mP; q = mPrime.nextPrime(q)) {
      mSeen.add(mP + q);
    }
    return Z.valueOf(mSeen.size());
  }
}
