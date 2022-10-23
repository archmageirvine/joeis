package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A072687 Number of primes with prime length names in range 1 -&gt; 10^n.
 * @author Sean A. Irvine
 */
public class A072687 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mLimit = 1;
  private long mC = 0;

  @Override
  public Z next() {
    mLimit *= 10;
    if (mLimit > Integer.MAX_VALUE) {
      throw new UnsupportedOperationException();
    }
    while ((mP = mPrime.nextPrime(mP)) < mLimit) {
      final int plen = English.SINGLETON.toText((int) mP).replaceAll("[ \\-]", "").length();
      if (mPrime.isPrime(plen)) {
        ++mC;
      }
    }
    mP = mPrime.prevPrime(mP);
    return Z.valueOf(mC);
  }
}
